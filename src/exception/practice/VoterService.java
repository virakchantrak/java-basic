package exception.practice;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;
import java.util.Set;

public class VoterService {

    private Set<Voter> voters = new HashSet<>();

    public void register(Person person) {
        validate(person);
        Voter voter = new Voter();
        voter.setVoterId((long) (voters.size() + 1));
        voter.setPerson(person);
        voter.setLocation("Default Location");
        voter.setCode("VOTER" + voter.getVoterId());
        voters.add(voter);
    }

    public void displayVoters() {
        for (Voter voter : voters) {
            System.out.println("Voter ID: " + voter.getVoterId() +
                               ", Name: " + voter.getPerson().getName() +
                               ", Location: " + voter.getLocation() +
                               ", Code: " + voter.getCode());
        }
    }

    private void validate(Person person) {
        if (person.getName() == null || person.getName().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }

        Period age = Period.between(person.getDateOfBirth(), LocalDate.now());
        if (age.getYears() < 18) {
            throw new IllegalArgumentException("Person must be at least 18 years old to register as a voter");
        }

        if (person.getIdCard() == null || person.getIdCard().isEmpty()) {
            throw new IllegalArgumentException("ID Card cannot be null or empty");
        }
    }
}
