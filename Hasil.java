package car.abstrac;

import java.util.Scanner;

public class Hasil {

    public static void main(String[] args) {

        // membuat objek Car
        Car alpard = new Toyota();
        Car aventador = new Lamborgini();
        Car modelX = new Tesla();
        Car series = new Bmw();

        // membuat objek user
        CarUser aufa = new CarUser(alpard);
        CarUser azka = new CarUser(aventador);
        CarUser fabian = new CarUser(modelX);
        CarUser kurnia = new CarUser(series);

       

        // biar enak, kita buat dalam program
        Scanner input = new Scanner(System.in);
        String aksi, pilihMobil;
        System.out.println("==SILAHKAN MEMILIH KENDARAAN==\n [1]Toyota \n [2]Lamborgini \n [3]Tesla \n [4]Bmw \n Pilih Mobil =");
        pilihMobil = input.nextLine();
        

        if (pilihMobil.equalsIgnoreCase("1")) {

            while (true) {
                System.out.println("=== APLIKASI SMART CAR ===");
                System.out.println("[1] Hidupkan Mesin Mobil");
                System.out.println("[2] Matikan Mesin Mobil");
                System.out.println("[3] Menaikkan Suhu Ac");
                System.out.println("[4] Menurunkan Suhu Ac");
                System.out.println("[5] Membuka bagasi");
                System.out.println("[6] Menutup bagasi");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if (aksi.equalsIgnoreCase("1")) {
                    aufa.startEngine();
                } else if (aksi.equalsIgnoreCase("2")) {
                    aufa.stopEngine();
                }  else if (aksi.equalsIgnoreCase("3")) {
                    aufa.temperatureUp();
                } else if (aksi.equalsIgnoreCase("4")) {
                    aufa.temperatureDown();
                }
                else if (aksi.equalsIgnoreCase("5")) {
                    aufa.bukaBagasi();
                } else if (aksi.equalsIgnoreCase("6")) {
                    aufa.tutupBagasi();
                } else if (aksi.equalsIgnoreCase("0")) {
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }

            }
        } else if (pilihMobil.equalsIgnoreCase("2")) {

            while (true) {
                System.out.println("=== APLIKASI SMART CAR ===");
                System.out.println("[1] Hidupkan Mesin Mobil");
                System.out.println("[2] Matikan Mesin Mobil");
                System.out.println("[3] Menaikkan Suhu Ac");
                System.out.println("[4] Menurunkan Suhu Ac");
                System.out.println("[5] Membuka bagasi");
                System.out.println("[6] Menutup bagasi");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if (aksi.equalsIgnoreCase("1")) {
                    azka.startEngine();
                } else if (aksi.equalsIgnoreCase("2")) {
                    aufa.stopEngine();
                } else if (aksi.equalsIgnoreCase("3")) {
                    azka.temperatureUp();
                }else if (aksi.equalsIgnoreCase("4")) {
                    azka.temperatureDown();
                }  else if (aksi.equalsIgnoreCase("5")) {
                    azka.bukaBagasi();
                } else if (aksi.equalsIgnoreCase("6")) {
                    azka.tutupBagasi();
                } else if (aksi.equalsIgnoreCase("0")) {
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }

            }
        } else if (pilihMobil.equalsIgnoreCase("3")) {

            while (true) {
                System.out.println("=== APLIKASI SMART CAR ===");
                System.out.println("[1] Hidupkan Mesin Mobil");
                System.out.println("[2] Matikan Mesin Mobil");
                System.out.println("[3] Menaikkan Suhu Ac");
                System.out.println("[4] Menurunkan Suhu Ac");
                System.out.println("[5] Membuka bagasi");
                System.out.println("[6] Menutup bagasi");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if (aksi.equalsIgnoreCase("1")) {
                    fabian.startEngine();
                } else if (aksi.equalsIgnoreCase("2")) {
                    fabian.stopEngine();
                } else if (aksi.equalsIgnoreCase("3")) {
                    fabian.temperatureUp();
                } else if (aksi.equalsIgnoreCase("4")) {
                    fabian.temperatureDown();
                } else if (aksi.equalsIgnoreCase("5")) {
                    fabian.bukaBagasi();
                } else if (aksi.equalsIgnoreCase("6")) {
                    fabian.tutupBagasi();
                } else if (aksi.equalsIgnoreCase("0")) {
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }

            }
        } else if (pilihMobil.equalsIgnoreCase("4")) {

            while (true) {
                System.out.println("=== APLIKASI SMART CAR ===");
                System.out.println("[1] Hidupkan Mesin Mobil");
                System.out.println("[2] Matikan Mesin Mobil");
                System.out.println("[3] Menaikkan Suhu Ac");
                System.out.println("[4] Menurunkan Suhu Ac");
                System.out.println("[5] Membuka bagasi");
                System.out.println("[6] Menutup bagasi");
                System.out.println("[0] Keluar");
                System.out.println("--------------------------");
                System.out.print("Pilih aksi> ");
                aksi = input.nextLine();

                if (aksi.equalsIgnoreCase("1")) {
                    fabian.startEngine();
                } else if (aksi.equalsIgnoreCase("2")) {
                    kurnia.stopEngine();
                }  else if (aksi.equalsIgnoreCase("3")) {
                    kurnia.temperatureUp();
                } else if (aksi.equalsIgnoreCase("4")) {
                    kurnia.temperatureDown();
                }else if (aksi.equalsIgnoreCase("5")) {
                    kurnia.bukaBagasi();
                } else if (aksi.equalsIgnoreCase("6")) {
                    kurnia.tutupBagasi();
                } else if (aksi.equalsIgnoreCase("0")) {
                    System.exit(0);
                } else {
                    System.out.println("Kamu memilih aksi yang salah!");
                }

            }
        } else {
            System.out.println("Gak nduwe mobile iku tok lur");
        }
    }

}
