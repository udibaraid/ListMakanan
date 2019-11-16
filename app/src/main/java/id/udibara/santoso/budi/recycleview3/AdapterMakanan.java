package id.udibara.santoso.budi.recycleview3;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdapterMakanan extends RecyclerView.Adapter<AdapterMakanan.MakananViewHolder> {
    // sebagai pelayan / untuk mengambil root dari aktivity
    Context context;
    List<Makanan> dataMakanan;

    public AdapterMakanan(Context context, List<Makanan> dataMakanan) {
        this.context = context;
        this.dataMakanan = dataMakanan;
    }

    @NonNull
    @Override
    public MakananViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*List item
        View view = LayoutInflater.from(context).inflate(R.layout.item_makanan,parent,false);

        Grid Item*/

      View view = LayoutInflater.from(context).inflate(R.layout.item_grid,parent,false);
        return new MakananViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MakananViewHolder holder, final int position) {
        holder.nama.setText(dataMakanan.get(position).getNama());

        Glide.with(context).load(dataMakanan.get(position).getPhoto()).into(holder.gambar);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailMakananActivity.class);
                intent.putExtra("nama",dataMakanan.get(position).getNama());
                intent.putExtra("gambar",dataMakanan.get(position).getPhoto());
                intent.putExtra("detail",dataMakanan.get(position).getDetail());
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return dataMakanan.size();
        //menampilkan berapa data yang akan di tampilkan
    }

    public class MakananViewHolder extends RecyclerView.ViewHolder {

        ImageView  gambar;
        TextView nama;

        public MakananViewHolder(@NonNull View itemView) {
            super(itemView);

            //itemView di ambil dari @NonNull View
            gambar = itemView.findViewById(R.id.image_makanan);
            nama = itemView.findViewById(R.id.nama_makanan);


        }
    }
}
