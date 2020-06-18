public class LinkedList implements IMultiList {
    Node head;

    @Override
    public void dataAwalParent() {
        Jurusan jurusan = new Jurusan(1, "Sistem Informasi", "samping masjid");
        addLastParent(jurusan);
        jurusan = new Jurusan(2, "Informatika", "samping masjid");
        addLastParent(jurusan);
        jurusan = new Jurusan(3, "D3 Sistem Informasi", "samping masjid");
        addLastParent(jurusan);
    }

    @Override
    public void addFirstParent(Jurusan data) {
        Node node = new Node();
        node.dataParent = data;
        node.next = null;

        boolean terdaftar = searchDataParent(node.dataParent.idjurusan);

        if (terdaftar) {
            System.out.println("Id Jurusan sudah terdaftar");
        } else {
            node.next = head;
            head = node;
            System.out.println("Insert Succes\n");
        }
    }

    @Override
    public void addAtParent(Jurusan data, int index) {
        Node node = new Node();
        node.dataParent = data;
        node.next = null;

        Node node1 = head;
        int totalIndex = 0;
        while (node1.next != null) {
            node1 = node1.next;
            totalIndex++;
        }

        if (totalIndex + 1 >= index) {
            boolean terdaftar = searchDataParent(node.dataParent.idjurusan);

            if (terdaftar) {
                System.out.println("Id Jurusan sudah terdaftar");
            } else {
                if (index == 0) {
                    addFirstParent(data);
                } else {
                    Node n = head;
                    for (int i = 0; i < index - 1; i++) {
                        n = n.next;
                    }
                    node.next = n.next;
                    n.next = node;

                    System.out.println("Insert Succes\n");
                }
            }
        } else {
            System.out.println("Index melebihi data yang tersedia,\nindex maksimal yang tersedia : " + totalIndex);
        }
    }

    @Override
    public void addLastParent(Jurusan data) {
        Node node = new Node();
        node.dataParent = data;
        node.next = null;

        boolean terdaftar = searchDataParent(node.dataParent.idjurusan);

        if (terdaftar) {
            System.out.println("Id Jurusan sudah terdaftar");
        } else {
            Node n = head;

            if (n == null) {
                addFirstParent(data);
            } else {
                while (n.next != null) {
                    n = n.next;
                }
                n.next = node;

                System.out.println("Insert Succes\n");
            }
        }
    }

    @Override
    public void deleteFirstParent() {
        if (head == null) {
            System.out.println("Tidak ada data");
        } else {
            head = head.next;

            System.out.println("Delete Succes\n");
        }
    }

    @Override
    public void deleteAtParent(int index) {
        if (head == null) {
            System.out.println("Tidak ada data");
        } else {

            Node node1 = head;
            int totalIndex = 0;
            while (node1.next != null) {
                node1 = node1.next;
                totalIndex++;
            }

            if (totalIndex < index) {
                System.out.println("Index melebihi data yang tersedia,\nindex maksimal yang tersedia : " + totalIndex);
            } else {
                if (index == 0) {
                    head = head.next;
                } else {
                    Node n = head;
                    for (int i = 0; i < index - 1; i++) {
                        n = n.next;
                    }
                    n.next = n.next.next;
                }
                System.out.println("Delete Succes\n");
            }
        }
    }

    @Override
    public void deleteLastParent() {
        if (head == null) {
            System.out.println("Tidak ada data");
        } else if (head.next == null) {
            deleteFirstParent();
        } else {
            Node n = head;
            while (n.next.next != null) {
                n = n.next;
            }
            n.next = null;

            System.out.println("Delete Succes\n");
        }
    }

    @Override
    public void viewDataParent() {
        Node node = head;

        while (true) {
            System.out.printf("%n%-17s: %s %n", "Id Jurusan", node.dataParent.idjurusan);
            System.out.printf("%-17s: %s %n", "Nama Jurusan", node.dataParent.namaJurusan);
            System.out.printf("%-17s: %s %n", "Lokasi Jurusan", node.dataParent.lokasiJurusan);

            if (node.next == null) {
                break;
            }

            node = node.next;
        }

        System.out.println("\nSelesai");
    }

    @Override
    public boolean searchDataParent(int idParent) {
        Node node = head;
        //jika tidak ada data
        if (node == null) {
            return false;
        } else {
            //traveling dan check data
            while (node.next != null) {
                if (idParent == node.dataParent.idjurusan) {
                    return true;
                }
                node = node.next;
            }

            //cek data terakhir
            return idParent == node.dataParent.idjurusan;
        }
    }

    @Override
    public void showSearchDataParent(int idParent) {
        Node node = head;
        if (node == null) {
            System.out.println("Tidak ada data");
        } else {
            //traveling dan check data
            boolean ketemu = false;
            while (node.next != null) {
                if (idParent == node.dataParent.idjurusan) {
                    ketemu = true;
                    break;
                }
                node = node.next;
            }

            //cek node terakhir
            if (idParent == node.dataParent.idjurusan) {
                ketemu = true;
            }

            if (ketemu) {
                System.out.printf("%n%-17s: %s %n", "Id Jurusan", node.dataParent.idjurusan);
                System.out.printf("%-17s: %s %n", "Nama Jurusan", node.dataParent.namaJurusan);
                System.out.printf("%-17s: %s %n", "Lokasi Jurusan", node.dataParent.lokasiJurusan);
            } else {
                System.out.println("Data not found");
            }
        }
    }

    @Override
    public void dataAwalChild() {
        Mahasiswa mahasiswa = new Mahasiswa("Naufal Rachmandani", 1910512085, "4.00");
        addLastChild(1, mahasiswa);
        mahasiswa = new Mahasiswa("Diny rahmawati", 1910512098, "4.00");
        addLastChild(1, mahasiswa);
        mahasiswa = new Mahasiswa("Imam abdul karim sulaiman", 1910512104, "4.00");
        addLastChild(1, mahasiswa);
        mahasiswa = new Mahasiswa("Muhammad dian rahndra", 1910512071, "4.00");
        addLastChild(1, mahasiswa);
        mahasiswa = new Mahasiswa("Aditya yoga", 1910512081, "4.00");
        addLastChild(1, mahasiswa);
    }

    @Override
    public void addFirstChild(int idParent, Mahasiswa data) {
        Node node = new Node();
        node.dataChild = data;
        node.next = null;

        boolean ketemu = searchDataChild(idParent, data.nim);

        if (ketemu) {
            System.out.println("Mahasiswa sudah terdaftar");
        } else {

            //traveling cari data id jurusan yang sesuai dengan mahasiswa
            Node n = head;
            while (!(n.dataParent.idjurusan == idParent) & n.next != null) {
                n = n.next;
            }

            //jika sudah sampe ujung node
            if (n.next == null) {
                // cek lagi data jurusan sama atau enggak
                if (n.dataParent.idjurusan == idParent) {
                    //cek jika belum ada mahasiswa di jurusan tsb
                    if (n.child == null) {
                        n.child = node;
                        n.child.next = null;
                    } else {
                        //jika sudah ada mahasiswa
                        node.next = n.child;
                        n.child = node;
                    }
                    System.out.println("Insert Succes\n");
                } else {
                    System.out.println("Jurusan tidak tersedia");
                }
            } else {
                //jika jurusan tersedia

                //cek jika belum ada mahasiswa di jurusan tsb
                if (n.child == null) {
                    n.child = node;
                    n.child.next = null;
                } else {
                    //jika sudah ada mahasiswa
                    node.next = n.child;
                    n.child = node;
                }

                System.out.println("Insert Succes\n");
            }
        }
    }

    @Override
    public void addAtChild(int idParent, Mahasiswa data, int index) {
        Node node = new Node();
        node.dataChild = data;
        node.next = null;

        boolean ketemu = searchDataChild(idParent, data.nim);

        if (ketemu) {
            System.out.println("Mahasiswa sudah terdaftar");
        } else {
            //traveling cari data id jurusan yang sesuai dengan mahasiswa
            Node n = head;
            while (!(n.dataParent.idjurusan == idParent) & n.next != null) {
                n = n.next;
            }

            //jika sudah sampe ujung node
            if (n.next == null) {
                // cek lagi data jurusan sama atau enggak
                if (n.dataParent.idjurusan == idParent) {
                    //cek jika belum ada mahasiswa di jurusan tsb
                    if (n.child == null) {
                        n.child = node;
                        n.child.next = null;
                        System.out.println("Insert Succes to head because data is not avaiable\n");
                    } else {
                        // jika sudah ada mahasiswa

                        Node nodeIndex = n.child;
                        int totalIndex = 0;
                        while (nodeIndex.next != null) {
                            nodeIndex = nodeIndex.next;
                            totalIndex++;
                        }

                        if (totalIndex + 1 >= index) {
                            if (index == 0) {
                                addFirstChild(idParent, data);
                            } else {
                                Node node1 = n.child;
                                for (int i = 0; i < index - 1; i++) {
                                    node1 = node1.next;
                                }
                                node.next = node1.next;
                                node1.next = node;

                                System.out.println("Insert Succes\n");
                            }
                        } else {
                            System.out.println("Index melebihi data yang tersedia,\nindex maksimal yang tersedia : " + totalIndex);
                        }
                    }
                } else {
                    System.out.println("Jurusan tidak tersedia");
                }
            } else {
                //jika jurusan tersedia

                //cek jika belum ada mahasiswa di jurusan tsb
                if (n.child == null) {
                    n.child = node;
                    n.child.next = null;
                    System.out.println("Insert Succes to head because data is not avaiable\n");
                } else {
                    // jika sudah ada mahasiswa

                    Node nodeIndex = n.child;
                    int totalIndex = 0;
                    while (nodeIndex.next != null) {
                        nodeIndex = nodeIndex.next;
                        totalIndex++;
                    }

                    if (totalIndex + 1 >= index) {
                        if (index == 0) {
                            addFirstChild(idParent, data);
                        } else {
                            Node node1 = n.child;
                            for (int i = 0; i < index - 1; i++) {
                                node1 = node1.next;
                            }
                            node.next = node1.next;
                            node1.next = node;

                            System.out.println("Insert Succes\n");
                        }
                    } else {
                        System.out.println("Index melebihi data yang tersedia,\nindex maksimal yang tersedia : " + totalIndex);
                    }
                }
            }
        }
    }

    @Override
    public void addLastChild(int idParent, Mahasiswa data) {
        Node node = new Node();
        node.dataChild = data;
        node.next = null;

        boolean ketemu = searchDataChild(idParent, data.nim);

        if (ketemu) {
            System.out.println("Mahasiswa sudah terdaftar");
        } else {
            //traveling cari data id jurusan yang sesuai dengan mahasiswa
            Node n = head;
            while (!(n.dataParent.idjurusan == idParent) & n.next != null) {
                n = n.next;
            }

            //jika sudah sampe ujung node
            if (n.next == null) {
                // cek lagi data jurusan sama atau enggak
                if (n.dataParent.idjurusan == idParent) {
                    //cek jika belum ada mahasiswa di jurusan tsb
                    if (n.child == null) {
                        n.child = node;
                        n.child.next = null;
                    } else {
                        //jika ada mahasiswa
                        n = n.child;
                        while (n.next != null) {
                            n = n.next;
                        }
                        n.next = node;
                    }

                    System.out.println("Insert Succes\n");
                } else {
                    System.out.println("Jurusan tidak tersedia");
                }
            } else {
                //jika jurusan tersedia

                //cek jika belum ada mahasiswa di jurusan tsb
                if (n.child == null) {
                    n.child = node;
                    n.child.next = null;
                } else {
                    n = n.child;
                    while (n.next != null) {
                        n = n.next;
                    }
                    n.next = node;
                }

                System.out.println("Insert Succes\n");
            }
        }
    }

    @Override
    public void deleteFirstChild(int idParent) {
        Node n = head;
        while (!(n.dataParent.idjurusan == idParent) & n.next != null) {
            n = n.next;
        }

        //jika sudah sampe ujung node
        if (n.next == null) {
            // cek lagi data jurusan sama atau enggak
            if (n.dataParent.idjurusan == idParent) {
                //cek jika belum ada mahasiswa di jurusan tsb
                if (n.child == null) {
                    System.out.println("Tidak ada data mahasiswa di jurusan " + n.dataParent.namaJurusan);
                } else {
                    //jika ada mahasiswa maka hapus mahasiswa pertama
                    n.child = n.child.next;

                    System.out.println("Delete Succes\n");
                }
            } else {
                System.out.println("Jurusan tidak tersedia");
            }
        } else {
            //jika jurusan tersedia

            //cek jika belum ada mahasiswa di jurusan tsb
            if (n.child == null) {
                System.out.println("Tidak ada data mahasiswa di jurusan " + n.dataParent.namaJurusan);
            } else {
                //jika ada mahasiswa maka hapus mahasiswa pertama
                n.child = n.child.next;

                System.out.println("Delete Succes\n");
            }
        }
    }

    @Override
    public void deleteAtChild(int idParent, int index) {
        Node n = head;
        while (!(n.dataParent.idjurusan == idParent) & n.next != null) {
            n = n.next;
        }

        //jika sudah sampe ujung node
        if (n.next == null) {
            // cek lagi data jurusan sama atau enggak
            if (n.dataParent.idjurusan == idParent) {
                //cek jika belum ada mahasiswa di jurusan tsb
                if (n.child == null) {
                    System.out.println("Tidak ada data mahasiswa di jurusan " + n.dataParent.namaJurusan);
                } else {
                    //jika ada mahasiswa

                    //jika index = 0
                    if (index == 0) {
                        deleteFirstChild(idParent);
                    } else {
                        n = n.child;
                        for (int i = 0; i < index - 1; i++) {
                            n = n.next;
                        }
                        n.next = n.next.next;

                        System.out.println("Delete Succes\n");
                    }
                }
            } else {
                System.out.println("Jurusan tidak tersedia");
            }
        } else {
            //jika jurusan tersedia

            //cek jika belum ada mahasiswa di jurusan tsb
            if (n.child == null) {
                System.out.println("Tidak ada data mahasiswa di jurusan " + n.dataParent.namaJurusan);
            } else {
                //jika ada mahasiswa

                //jika index = 0
                if (index == 0) {
                    deleteFirstChild(idParent);
                } else {
                    n = n.child;
                    for (int i = 0; i < index - 1; i++) {
                        n = n.next;
                    }

                    n.next = n.next.next;

                    System.out.println("Delete Succes\n");
                }
            }
        }
    }

    @Override
    public void deleteLastChild(int idParent) {
        Node n = head;
        while (!(n.dataParent.idjurusan == idParent) & n.next != null) {
            n = n.next;
        }

        //jika sudah sampe ujung node
        if (n.next == null) {
            // cek lagi data jurusan sama atau enggak
            if (n.dataParent.idjurusan == idParent) {
                //cek jika belum ada mahasiswa di jurusan tsb
                if (n.child == null) {
                    System.out.println("Tidak ada data mahasiswa di jurusan " + n.dataParent.namaJurusan);
                } else {
                    //jika ada mahasiswa maka hapus mahasiswa terkahir
                    n = n.child;
                    while (n.next.next != null) {
                        n = n.next;
                    }
                    n.next = null;

                    System.out.println("Delete Succes\n");
                }
            } else {
                System.out.println("Jurusan tidak tersedia");
            }
        } else {
            //jika jurusan terdaftar

            //cek jika belum ada mahasiswa di jurusan tsb
            if (n.child == null) {
                System.out.println("Tidak ada data mahasiswa di jurusan " + n.dataParent.namaJurusan);
            } else {
                //jika ada mahasiswa maka hapus mahasiswa terkahir
                n = n.child;
                while (n.next.next != null) {
                    n = n.next;
                }
                n.next = null;

                System.out.println("Delete Succes\n");
            }
        }

    }

    @Override
    public void viewDataChild(int idChild) {
        Node node = head;
        while (!(node.dataParent.idjurusan == idChild) & node.next != null) {
            node = node.next;
        }

        //jika sudah sampe ujung node
        if (node.next == null) {
            // cek lagi data jurusan sama atau enggak
            if (node.dataParent.idjurusan == idChild) {
                System.out.println("\nData mahasiswa jurusan " + node.dataParent.namaJurusan + " : ");

                //cek jika belum ada mahasiswa di jurusan tsb
                if (node.child == null) {
                    System.out.println("Belum ada mahasiswa");
                } else {
                    node = node.child;
                    while (true) {
                        System.out.printf("%n%-17s: %s %n", "Nama Mahasiswa", node.dataChild.nama);
                        System.out.printf("%-17s: %s %n", "NIM Mahasiswa", node.dataChild.nim);
                        System.out.printf("%-17s: %s %n", "IPK Mahasiswa", node.dataChild.ipk);

                        if (node.next == null) {
                            break;
                        }

                        node = node.next;
                    }

                    System.out.println("\nSelesai");
                }
            } else {
                System.out.println("Jurusan tidak tersedia");
            }
        } else {
            //jika jurusan tersedia
            System.out.println("\nData mahasiswa jurusan " + node.dataParent.namaJurusan + " : ");

            //cek jika belum ada mahasiswa di jurusan tsb
            if (node.child == null) {
                System.out.println("Belum ada mahasiswa");
            } else {
                //jika ada mahasiswanya print

                node = node.child;
                while (true) {
                    System.out.printf("%n%-17s: %s %n", "Nama Mahasiswa", node.dataChild.nama);
                    System.out.printf("%-17s: %s %n", "NIM Mahasiswa", node.dataChild.nim);
                    System.out.printf("%-17s: %s %n", "IPK Mahasiswa", node.dataChild.ipk);

                    if (node.next == null) {
                        break;
                    }

                    node = node.next;
                }

                System.out.println("\nSelesai");
            }
        }
    }

    @Override
    public boolean searchDataChild(int idParent, int idChild) {
        Node node = head;
        while (!(node.dataParent.idjurusan == idParent) & node.next != null) {
            node = node.next;
        }

        //jika sudah sampe ujung node
        if (node.next == null) {

            // cek lagi data jurusan sama atau enggak
            if (node.dataParent.idjurusan == idParent) {

                //cek jika belum ada mahasiswa di jurusan tsb
                if (node.child == null) {
                    return false;
                } else {
                    node = node.child;
                    while (!(node.dataChild.nim == idChild) & node.next != null) {
                        node = node.next;
                    }

                    if (node.next == null) {
                        return node.dataChild.nim == idChild;
                    } else {
                        //jika data ditemukan
                        return true;
                    }
                }
            } else {
                return false;
            }
        } else {
            //jika jurusan tersedia

            //cek jika belum ada mahasiswa di jurusan tsb
            if (node.child == null) {
                return false;
            } else {
                node = node.child;
                while (!(node.dataChild.nim == idChild) & node.next != null) {
                    node = node.next;
                }

                if (node.next == null) {
                    return node.dataChild.nim == idChild;
                } else {
                    //jika data ditemukan
                    return true;
                }
            }
        }
    }

    @Override
    public void showSearchDataChild(int idParent, int idChild) {
        Node node = head;
        while (!(node.dataParent.idjurusan == idParent) & node.next != null) {
            node = node.next;
        }

        //jika sudah sampe ujung node
        if (node.next == null) {
            // cek lagi data jurusan sama atau enggak
            if (node.dataParent.idjurusan == idParent) {
                System.out.println("\nData mahasiswa jurusan " + node.dataParent.namaJurusan + " : ");

                //cek jika belum ada mahasiswa di jurusan tsb
                if (node.child == null) {
                    System.out.println("Belum ada mahasiswa");
                } else {
                    node = node.child;
                    while (!(node.dataChild.nim == idChild) & node.next != null) {
                        node = node.next;
                    }

                    boolean ketemu = false;
                    if (node.next == null) {
                        if (node.dataChild.nim == idChild) {
                            ketemu = true;
                        }
                    } else {
                        //jika data ditemukan
                        ketemu = true;
                    }

                    if (ketemu) {
                        System.out.printf("%n%-17s: %s %n", "Nama Mahasiswa", node.dataChild.nama);
                        System.out.printf("%-17s: %s %n", "NIM Mahasiswa", node.dataChild.nim);
                        System.out.printf("%-17s: %s %n", "IPK Mahasiswa", node.dataChild.ipk);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                }
            } else {
                System.out.println("Jurusan tidak tersedia");
            }
        } else {
            //jika jurusan tersedia

            System.out.println("\nData mahasiswa jurusan " + node.dataParent.namaJurusan + " : ");

            //cek jika belum ada mahasiswa di jurusan tsb
            if (node.child == null) {
                System.out.println("Belum ada mahasiswa");
            } else {
                node = node.child;
                while (!(node.dataChild.nim == idChild) & node.next != null) {
                    node = node.next;
                }

                boolean ketemu = false;
                if (node.next == null) {
                    if (node.dataChild.nim == idChild) {
                        ketemu = true;
                    }
                } else {
                    //jika data ditemukan
                    ketemu = true;
                }

                if (ketemu) {
                    System.out.printf("%n%-17s: %s %n", "Nama Mahasiswa", node.dataChild.nama);
                    System.out.printf("%-17s: %s %n", "NIM Mahasiswa", node.dataChild.nim);
                    System.out.printf("%-17s: %s %n", "IPK Mahasiswa", node.dataChild.ipk);
                } else {
                    System.out.println("Mahasiswa tidak ditemukan");
                }
            }
        }
    }

    @Override
    public void sortingDataParent() {
        sortParent();

        System.out.println("Sorting selesai");
    }

    @Override
    public void sortingDataChild(int idParent) {
        boolean ketemu = searchDataParent(idParent);

        if (ketemu) {

            sortChild(idParent);

            System.out.println("Sorting selesai");
        } else {
            System.out.println("Jurusan tidak ditemukan");
        }
    }

    @Override
    public void sortParent() {
        //Node current will point to head
        Node current = head, index;
        Jurusan temp;

        if (head == null) {
            System.out.println("Tidak ada data jurusan");
        } else {
            while (current != null) {
                //Node index will point to node next to current
                index = current.next;

                while (index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if (current.dataParent.idjurusan > index.dataParent.idjurusan) {
                        temp = current.dataParent;
                        current.dataParent = index.dataParent;
                        index.dataParent = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    @Override
    public void sortChild(int idParent) {
        //Node current will point to head
        Node current = head, index;
        Mahasiswa temp;

        if (head == null) {
            System.out.println("Tidak ada data jurusan");
        } else {
            //cari jurusan yang cocok
            while (!(current.dataParent.idjurusan == idParent) & current.next != null) {
                current = current.next;
            }
            current = current.child;

            while (current != null) {
                //Node index will point to node next to current
                index = current.next;

                while (index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if (current.dataChild.nim > index.dataChild.nim) {
                        temp = current.dataChild;
                        current.dataChild = index.dataChild;
                        index.dataChild = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }


}
