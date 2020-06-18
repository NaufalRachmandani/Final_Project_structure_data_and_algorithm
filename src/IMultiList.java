public interface IMultiList {
    void dataAwalParent();

    void addFirstParent(Jurusan data);
    void addAtParent(Jurusan data, int index);
    void addLastParent(Jurusan data);

    void deleteFirstParent();
    void deleteAtParent(int index);
    void deleteLastParent();

    void viewDataParent();
    boolean searchDataParent(int idParent);
    void showSearchDataParent(int idParent);


    void dataAwalChild();

    void addFirstChild(int idParent, Mahasiswa data);
    void addAtChild(int idParent, Mahasiswa data, int index);
    void addLastChild(int idParent, Mahasiswa data);

    void deleteFirstChild(int idParent);
    void deleteAtChild(int idParent, int index);
    void deleteLastChild(int idParent);

    void viewDataChild(int idChild);
    boolean searchDataChild(int idParent, int idChild);
    void showSearchDataChild(int idParent, int idChild);


    void sortingDataParent();
    void sortingDataChild(int idParent);

    void sortParent();
    void sortChild(int idParent);
}
