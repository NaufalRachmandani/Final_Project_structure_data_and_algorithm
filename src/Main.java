


/*
    Created by :
    Naufal Rachmandani 1910512085
    Diny rahmawati 1910512098
    Imam abdul karim sulaiman 1910512104
    Muhammad dian rahndra 1910512071
    Aditya yoga 1910512081

    Note : Dibuat di Intellij IDE
*/


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedList list = new LinkedList();
        System.out.println("Menambahkan data awal...");

        list.dataAwalParent();
        list.dataAwalChild();

        Jurusan jurusan;
        int idJurusan;
        String namaJurusan;
        String lokasiJurusan;
        int index;
        int menu;

        Mahasiswa mahasiswa;
        String namaMahasiswa;
        int nimMahasiswa;
        String ipkMahasiswa;

        while (true) {

            System.out.print("\nMENU" +
                    "\n1.Insert Data Jurusan (First)" +
                    "\n2.Insert Data Jurusan (At)" +
                    "\n3.Insert Data Jurusan (Last)" +
                    "\n4.Insert Data Mahasiswa (First)" +
                    "\n5.Insert Data Mahasiswa (At)" +
                    "\n6.Insert Data Mahasiswa (Last)" +
                    "\n7.Delete Data Jurusan (First)" +
                    "\n8.Delete Data Jurusan (At)" +
                    "\n9.Delete Data Jurusan (Last)" +
                    "\n10.Delete Data Mahasiswa (First)" +
                    "\n11.Delete Data Mahasiswa (At)" +
                    "\n12.Delete Data Mahasiswa (Last)" +
                    "\n13.View Data Jurusan" +
                    "\n14.View Data Mahasiswa" +
                    "\n15.Search Data Jurusan" +
                    "\n16.Search Data Mahasiswa" +
                    "\n17.Sorting Data Jurusan" +
                    "\n18.Sorting Data Mahasiswa" +
                    "\n0.EXIT" +
                    "\nMasukkan Pilihan : ");
            menu = Integer.parseInt(scanner.nextLine());


            switch (menu) {
                case 1:
                    System.out.println("\nInsert data jurusan");
                    System.out.print("Id Jurusan : ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nama Jurusan : ");
                    namaJurusan = scanner.nextLine();
                    System.out.print("Lokasi Jurusan : ");
                    lokasiJurusan = scanner.nextLine();

                    jurusan = new Jurusan(idJurusan, namaJurusan, lokasiJurusan);
                    list.addFirstParent(jurusan);
                    break;
                case 2:
                    System.out.println("\nInsert data jurusan");
                    System.out.print("Id Jurusan : ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nama Jurusan : ");
                    namaJurusan = scanner.nextLine();
                    System.out.print("Lokasi Jurusan : ");
                    lokasiJurusan = scanner.nextLine();
                    System.out.print("Index Jurusan(Masukkan Angka) : ");
                    index = Integer.parseInt(scanner.nextLine());

                    jurusan = new Jurusan(idJurusan, namaJurusan, lokasiJurusan);
                    list.addAtParent(jurusan, index);
                    break;
                case 3:
                    System.out.println("\nInsert data jurusan");
                    System.out.print("Id Jurusan : ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nama Jurusan : ");
                    namaJurusan = scanner.nextLine();
                    System.out.print("Lokasi Jurusan : ");
                    lokasiJurusan = scanner.nextLine();

                    jurusan = new Jurusan(idJurusan, namaJurusan, lokasiJurusan);
                    list.addLastParent(jurusan);
                    break;
                case 4:
                    System.out.println("\nInsert data mahasiswa");
                    System.out.print("Id Jurusan mahasiswa yang ingin ditambahkan: ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nama Mahasiswa : ");
                    namaMahasiswa = scanner.nextLine();
                    System.out.print("NIM Mahasiswa : ");
                    nimMahasiswa = Integer.parseInt(scanner.nextLine());
                    System.out.print("IPK Mahasiswa : ");
                    ipkMahasiswa = scanner.nextLine();

                    mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa, ipkMahasiswa);
                    list.addFirstChild(idJurusan, mahasiswa);
                    break;
                case 5:
                    System.out.println("\nInsert data mahasiswa");
                    System.out.print("Id Jurusan mahasiswa yang ingin ditambahkan: ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nama Mahasiswa : ");
                    namaMahasiswa = scanner.nextLine();
                    System.out.print("NIM Mahasiswa : ");
                    nimMahasiswa = Integer.parseInt(scanner.nextLine());
                    System.out.print("IPK Mahasiswa : ");
                    ipkMahasiswa = scanner.nextLine();
                    System.out.print("Index Mahasiswa(Masukkan Angka) : ");
                    index = Integer.parseInt(scanner.nextLine());

                    mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa, ipkMahasiswa);
                    list.addAtChild(idJurusan, mahasiswa, index);
                    break;
                case 6:
                    System.out.println("\nInsert data mahasiswa");
                    System.out.print("Id Jurusan mahasiswa yang ingin ditambahkan: ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nama Mahasiswa : ");
                    namaMahasiswa = scanner.nextLine();
                    System.out.print("NIM Mahasiswa : ");
                    nimMahasiswa = Integer.parseInt(scanner.nextLine());
                    System.out.print("IPK Mahasiswa : ");
                    ipkMahasiswa = scanner.nextLine();

                    mahasiswa = new Mahasiswa(namaMahasiswa, nimMahasiswa, ipkMahasiswa);
                    list.addLastChild(idJurusan, mahasiswa);
                    break;
                case 7:
                    System.out.println("\nDelete data jurusan");

                    list.deleteFirstParent();
                    break;
                case 8:
                    System.out.println("\nDelete data jurusan");
                    System.out.print("Masukkan index jurusan yang ingin dihapus(Masukkan Angka) : ");
                    index = Integer.parseInt(scanner.nextLine());

                    list.deleteAtParent(index);
                    break;
                case 9:
                    System.out.println("\nDelete data jurusan");

                    list.deleteLastParent();
                    break;
                case 10:
                    System.out.println("\nDelete data mahasiswa");

                    System.out.print("Id Jurusan mahasiswa yang ingin dihapus: ");
                    idJurusan = Integer.parseInt(scanner.nextLine());

                    list.deleteFirstChild(idJurusan);
                    break;
                case 11:
                    System.out.println("\nDelete data mahasiswa");

                    System.out.print("Id Jurusan mahasiswa yang ingin dihapus: ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan index Mahasiswa yang ingin dihapus(Masukkan Angka) : ");
                    index = Integer.parseInt(scanner.nextLine());

                    list.deleteAtChild(idJurusan, index);
                    break;
                case 12:
                    System.out.println("\nDelete data mahasiswa");

                    System.out.print("Id Jurusan mahasiswa yang ingin dihapus: ");
                    idJurusan = Integer.parseInt(scanner.nextLine());

                    list.deleteLastChild(idJurusan);
                    break;
                case 13:
                    System.out.println("\nView data jurusan");
                    list.viewDataParent();
                    break;
                case 14:
                    System.out.println("\nView data mahasiswa");
                    System.out.print("Masukkan Id jurusan untuk mahasiswa yang akan di print : ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    list.viewDataChild(idJurusan);
                    break;
                case 15:
                    System.out.println("\nSearch data jurusan");
                    System.out.print("Masukkan Id jurusan untuk jurusan yang akan di cari : ");
                    idJurusan = Integer.parseInt(scanner.nextLine());

                    list.showSearchDataParent(idJurusan);
                    break;
                case 16:
                    System.out.println("\nSearch data mahasiswa di suatu jurusan");
                    System.out.print("Masukkan Id jurusan : ");
                    idJurusan = Integer.parseInt(scanner.nextLine());
                    System.out.print("Masukkan NIM mahasiswa : ");
                    nimMahasiswa = Integer.parseInt(scanner.nextLine());

                    list.showSearchDataChild(idJurusan, nimMahasiswa);
                    break;
                case 17:
                    System.out.println("\nSorting data Jurusan");

                    list.sortingDataParent();
                    break;
                case 18:
                    System.out.println("\nSorting data Mahasiswa di suatu jurusan");
                    System.out.print("Masukkan Id jurusan : ");
                    idJurusan = Integer.parseInt(scanner.nextLine());

                    list.sortingDataChild(idJurusan);
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Anda salah memasukkan menu");
            }
        }
    }
}
