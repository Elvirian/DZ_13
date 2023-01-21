package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    public List<Recording> recordingList;

    public Phonebook() {
        recordingList = new ArrayList<>();
    }

    public Phonebook(List<Recording> recordingList) {
        this.recordingList = recordingList;
    }

    public void add(String name, Integer... phoneNumbers) {
        Recording newRecording = new Recording();
        List<Integer> newPhoneNumbers = new ArrayList<>();

        for (int i = 0; i < phoneNumbers.length; i++) {
            newPhoneNumbers.add(phoneNumbers[i]);
        }

        newRecording.setName(name);
        newRecording.setPhoneNumber(newPhoneNumbers);

        this.recordingList.add(newRecording);
    }

    public void add(Recording newRecording) {
        this.recordingList.add(newRecording);
    }

    public Recording find(String name) {

        for (int i = 0; i < recordingList.size(); i++) {
            if (recordingList.get(i).getName().equals(name)) {
                return recordingList.get(i);
            }
        }

        return null;
    }

    public List<Recording> findAll(String... name) {
        List<Recording> findResult = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < recordingList.size(); j++) {
                if (recordingList.get(j).getName().equals(name[i])) {
                    findResult.add(recordingList.get(j));
                    break;
                } else if (j == (recordingList.size() - 1)) {
                    findResult.add(null);
                }
            }
        }

        if (findResult.contains(null)) {
            return null;
        }

        return findResult;
    }

    @Override
    public String toString() {
        return "Phonebook{" +
                "recordingList=" + recordingList +
                '}';
    }
}