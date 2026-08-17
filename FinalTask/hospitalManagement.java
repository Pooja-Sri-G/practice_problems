import java.util.*;

abstract class Person {
    private int id;
    private String name;
    private int age;

    Person(int id, String name, int age) throws InvalidAgeException {
        if (age <= 0) {
            throw new InvalidAgeException("Invalid age");
        }
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    abstract void displayDetails();
}

class Patient extends Person {
    private String disease;
    private String bloodGroup;

    Patient(int id, String name, int age, String disease, String bloodGroup)
            throws InvalidAgeException {
        super(id, name, age);
        this.disease = disease;
        this.bloodGroup = bloodGroup;
    }

    void displayDetails() {
        System.out.println("ID: " + getId() + ", Name: " + getName()
                + ", Age: " + getAge()
                + ", Disease: " + disease
                + ", Blood Group: " + bloodGroup);
    }
}

class Doctor extends Person {
    private String speciality;
    private int experience;
    private double fee;

    Doctor(int id, String name, int age, String speciality,
           int experience, double fee) throws InvalidAgeException {
        super(id, name, age);
        this.speciality = speciality;
        this.experience = experience;
        this.fee = fee;
    }

    public String getSpeciality() {
        return speciality;
    }

    void displayDetails() {
        System.out.println("ID: " + getId() + ", Name: " + getName()
                + ", Age: " + getAge()
                + ", Speciality: " + speciality
                + ", Experience: " + experience
                + ", Fee: " + fee);
    }
}

class Department {
    private int id;
    private String name;

    Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("Department ID: " + id + ", Name: " + name);
    }
}

class Appointment {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private String date;
    private String time;
    private String status;

    Appointment(int id, Patient patient, Doctor doctor,
                String date, String time) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.time = time;
        this.status = "Booked";
    }

    public int getId() {
        return id;
    }

    void cancel() {
        status = "Cancelled";
    }

    void display() {
        System.out.println("Appointment ID: " + id
                + ", Patient: " + patient.getName()
                + ", Doctor: " + doctor.getName()
                + ", Date: " + date
                + ", Time: " + time
                + ", Status: " + status);
    }
}

class PatientNotFoundException extends Exception {
    PatientNotFoundException(String message) {
        super(message);
    }
}

class DoctorNotFoundException extends Exception {
    DoctorNotFoundException(String message) {
        super(message);
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class Hospital {
    ArrayList<Patient> patients = new ArrayList<>();
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Department> departments = new ArrayList<>();
    LinkedList<Appointment> appointments = new LinkedList<>();

    void addPatient(Patient p) {
        patients.add(p);
        System.out.println("Patient added");
    }

    void addDoctor(Doctor d) {
        doctors.add(d);
        System.out.println("Doctor added");
    }

    void addDepartment(Department d) {
        departments.add(d);
        System.out.println("Department added");
    }

    Patient findPatient(int id) throws PatientNotFoundException {
        for (Patient p : patients) {
            if (p.getId() == id) {
                return p;
            }
        }
        throw new PatientNotFoundException("Patient not found");
    }

    Doctor findDoctor(int id) throws DoctorNotFoundException {
        for (Doctor d : doctors) {
            if (d.getId() == id) {
                return d;
            }
        }
        throw new DoctorNotFoundException("Doctor not found");
    }

    void searchPatient(int id) throws PatientNotFoundException {
        findPatient(id).displayDetails();
    }

    void searchDoctor(int id) throws DoctorNotFoundException {
        findDoctor(id).displayDetails();
    }

    void removePatient(int id) throws PatientNotFoundException {
        Patient p = findPatient(id);
        patients.remove(p);
        System.out.println("Patient removed");
    }

    void removeDoctor(int id) throws DoctorNotFoundException {
        Doctor d = findDoctor(id);
        doctors.remove(d);
        System.out.println("Doctor removed");
    }

    void displayPatients() {
        for (Patient p : patients) {
            p.displayDetails();
        }
    }

    void displayDoctors() {
        for (Doctor d : doctors) {
            d.displayDetails();
        }
    }

    void displayDepartments() {
        for (Department d : departments) {
            d.display();
        }
    }

    void searchSpeciality(String speciality) {
        for (Doctor d : doctors) {
            if (d.getSpeciality().equalsIgnoreCase(speciality)) {
                d.displayDetails();
            }
        }
    }

    void bookAppointment(int appointmentId, int patientId,
                         int doctorId, String date, String time)
            throws PatientNotFoundException, DoctorNotFoundException {

        Patient p = findPatient(patientId);
        Doctor d = findDoctor(doctorId);

        appointments.add(
                new Appointment(appointmentId, p, d, date, time)
        );

        System.out.println("Appointment booked");
    }

    void cancelAppointment(int id) {
        for (Appointment a : appointments) {
            if (a.getId() == id) {
                a.cancel();
                System.out.println("Appointment cancelled");
                return;
            }
        }
        System.out.println("Appointment not found");
    }

    void displayAppointments() {
        for (Appointment a : appointments) {
            a.display();
        }
    }
}

public class hospitalManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("\n1. Add Patient");
            System.out.println("2. Add Doctor");
            System.out.println("3. Add Department");
            System.out.println("4. Search Patient");
            System.out.println("5. Search Doctor");
            System.out.println("6. Remove Patient");
            System.out.println("7. Remove Doctor");
            System.out.println("8. Display Patients");
            System.out.println("9. Display Doctors");
            System.out.println("10. Display Departments");
            System.out.println("11. Book Appointment");
            System.out.println("12. Cancel Appointment");
            System.out.println("13. Display Appointments");
            System.out.println("14. Search Doctor by Speciality");
            System.out.println("15. Exit");

            try {
                System.out.print("Enter choice: ");
                int choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.print("ID: ");
                        int pid = sc.nextInt();

                        System.out.print("Name: ");
                        String pname = sc.next();

                        System.out.print("Age: ");
                        int page = sc.nextInt();

                        System.out.print("Disease: ");
                        String disease = sc.next();

                        System.out.print("Blood Group: ");
                        String blood = sc.next();

                        hospital.addPatient(
                                new Patient(pid, pname, page, disease, blood)
                        );
                        break;

                    case 2:
                        System.out.print("ID: ");
                        int did = sc.nextInt();

                        System.out.print("Name: ");
                        String dname = sc.next();

                        System.out.print("Age: ");
                        int dage = sc.nextInt();

                        System.out.print("Speciality: ");
                        String speciality = sc.next();

                        System.out.print("Experience: ");
                        int experience = sc.nextInt();

                        System.out.print("Fee: ");
                        double fee = sc.nextDouble();

                        hospital.addDoctor(
                                new Doctor(did, dname, dage,
                                        speciality, experience, fee)
                        );
                        break;

                    case 3:
                        System.out.print("Department ID: ");
                        int deptId = sc.nextInt();

                        System.out.print("Department Name: ");
                        String deptName = sc.next();

                        hospital.addDepartment(
                                new Department(deptId, deptName)
                        );
                        break;

                    case 4:
                        System.out.print("Patient ID: ");
                        hospital.searchPatient(sc.nextInt());
                        break;

                    case 5:
                        System.out.print("Doctor ID: ");
                        hospital.searchDoctor(sc.nextInt());
                        break;

                    case 6:
                        System.out.print("Patient ID: ");
                        hospital.removePatient(sc.nextInt());
                        break;

                    case 7:
                        System.out.print("Doctor ID: ");
                        hospital.removeDoctor(sc.nextInt());
                        break;

                    case 8:
                        hospital.displayPatients();
                        break;

                    case 9:
                        hospital.displayDoctors();
                        break;

                    case 10:
                        hospital.displayDepartments();
                        break;

                    case 11:
                        System.out.print("Appointment ID: ");
                        int aid = sc.nextInt();

                        System.out.print("Patient ID: ");
                        int ap = sc.nextInt();

                        System.out.print("Doctor ID: ");
                        int ad = sc.nextInt();

                        System.out.print("Date: ");
                        String date = sc.next();

                        System.out.print("Time: ");
                        String time = sc.next();

                        hospital.bookAppointment(
                                aid, ap, ad, date, time
                        );
                        break;

                    case 12:
                        System.out.print("Appointment ID: ");
                        hospital.cancelAppointment(sc.nextInt());
                        break;

                    case 13:
                        hospital.displayAppointments();
                        break;

                    case 14:
                        System.out.print("Speciality: ");
                        hospital.searchSpeciality(sc.next());
                        break;

                    case 15:
                        System.out.println("Thank you");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice");
                }

            } catch (InputMismatchException e) {
                System.out.println("Enter valid input");
                sc.nextLine();

            } catch (PatientNotFoundException |
                     DoctorNotFoundException |
                     InvalidAgeException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
