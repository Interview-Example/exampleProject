package utilities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteToTxt {

/*
  public static void saveRegistrantData(Registrant registrant) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_registrant_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrant + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }




    }

    public static void saveRegistrantData(ManagedUserVM registrant) {
        try {
            //src/test/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_registrant_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(registrant + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveAppointData(Appointment appointment) {

        try {

            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("appointment_records"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointment + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }





    public static void saveTestItemsData(TestItem testItem) {
        try {

            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("test_items_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            writer.append(testItem + "\n");




            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void saveAppointmentRequest(AppointmentRequest appointmentRequest) {

        try {

            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("appointment_requests"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(appointmentRequest + "\n");


            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void saveRegistrantData(List<Object> SSNIds) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("database_registrant_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);

            for (Object eachSSN : SSNIds) {
                writer.append(eachSSN + ",\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    public static void savePatientData(Patient[] patient) {
        try {
            //src/resources/testdata/Registrantdata.txt
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_all_patient_data"), false);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            for (int i = 0; i < patient.length; i++) {
                writer.append(patient[i] + "\n");
            }

            writer.close();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    public static void saveMessagesData(CMessage messages) {

        try {
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("messagesFile"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(messages.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void saveStaff(Staff staff){

        try{

            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("staff_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(staff+"\n");
            writer.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void savePhysician(Physician physician) {

        try {

            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("physician_data"), true);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.append(physician + "\n");
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void saveRoomData(RoomsPojo room){
        try{

            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("api_room_data"), true);

            BufferedWriter writer = new BufferedWriter(fileWriter);


            writer.append(room+"\n");


            writer.close();




        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void saveCountriesData(Country country) {

        try {
            FileWriter fileWriter = new FileWriter(ConfigReader.getProperty("countryFile"), true);


            BufferedWriter writer = new BufferedWriter(fileWriter);

//            writer.append(registrant.getFirstName() + "," + registrant.getLastName() + ","
//                            + registrant.getUsername() + "," + registrant.getEmail() + ","
//                            + registrant.getPassword() + "," + registrant.getSSN() + ", \n");

            writer.append(country.toString() + ", \n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



 */


}
