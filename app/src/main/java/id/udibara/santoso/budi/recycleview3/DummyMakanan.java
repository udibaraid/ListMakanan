package id.udibara.santoso.budi.recycleview3;

import java.util.ArrayList;

public class DummyMakanan {

    public static ArrayList<Makanan> listMakanan(){
        ArrayList<Makanan> makanan = new ArrayList<>();
        makanan.add(new Makanan(1,"Ayam Goreng",R.drawable.ayam,"Ayam goreng adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(2,"Alpukat",R.drawable.alpukat,"Alpukat adalah buah dengan kadar protein tinggi"));
        makanan.add(new Makanan(3,"Bakso",R.drawable.bakso,"bakso adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(4,"Durian",R.drawable.durian,"Durian adalah buah dengan rasa khas dan wow"));
        makanan.add(new Makanan(5,"Rendang",R.drawable.rendang,"rendang  adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(6,"Sate",R.drawable.sate,"sate adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas."));
        makanan.add(new Makanan(7,"Soto",R.drawable.soto,"soto adalah hidangan yang dibuat dari daging ayam dicampur tepung bumbu yang digoreng dalam minyak goreng panas"));
        return makanan;
    }
}
