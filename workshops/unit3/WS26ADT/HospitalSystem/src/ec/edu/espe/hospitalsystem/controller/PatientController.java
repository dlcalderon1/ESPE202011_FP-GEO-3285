package ec.edu.espe.hospitalsystem.controller;

import ec.edu.espe.hospitalsystem.model.Patient;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utils.FileManager;

public class PatientController {

    public void save(Patient patient) {
        Patient[] patients = new Patient[FileManager.countLines("patients")];
        String[] rows = new String[FileManager.countLines("patients")];
        read(rows, patients);
        if (find(patients, patient.getName()) != -1) {
            JOptionPane.showMessageDialog(null, "patient -> " + patient.getName()
                    + " <- already exists", "USE OTHER NAME", JOptionPane.CANCEL_OPTION);
            return;
        } else {
            String data = patient.getName() + "," + patient.getCI() + "," + patient.getAge()
                    + "," + patient.getBloodType() + "," + patient.isIsparacetamolAllergic()
                    + "," + patient.getWeight() + "," + patient.getSex();
            FileManager.save(data, "patients");
        }
    }

    public void read(String[] data, Patient[] patients) {

        FileManager.readLines("patients", data);
        for (int i = 0; i < data.length; i++) {
            
            String[] dataForPatient = data[i].split(",");
            String name = dataForPatient[0];
            String CI = dataForPatient[1];
            int age = Integer.parseInt(dataForPatient[2]);
            String bloodType = dataForPatient[3];
            boolean isParacetamolAllergic = Boolean.parseBoolean(dataForPatient[4]);
            float weight = Float.parseFloat(dataForPatient[5]);
            String sex = dataForPatient[6];

            patients[i] = new Patient(name, CI, age, bloodType, isParacetamolAllergic, 
            weight, sex);
        }
    }

    public int find(Patient[] patients, String name) {
        for (int i = 0; i < patients.length; i++) {
            if (name.equals(patients[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void populatePatientsTable(JTable jTable, Patient[] patients) {

        DefaultTableModel model = (DefaultTableModel) jTable.getModel();
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }

        Object rowData[] = new Object[patients.length];
        for (int i = 0; i < patients.length; i++) {
            rowData[0] = patients[i].getName();
            rowData[1] = patients[i].getCI();
            rowData[2] = patients[i].getAge();
            rowData[3] = patients[i].getBloodType();
            rowData[4] = patients[i].isIsparacetamolAllergic();
            rowData[5] = patients[i].getWeight();
            rowData[6] = patients[i].getSex();
            model.addRow(rowData);
        }

    }

}
