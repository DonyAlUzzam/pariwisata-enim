package com.example.pariwisataenim;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import static android.view.LayoutInflater.from;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.MyHolder> {

    String nama[] = {"Masjid Al-Baniah",
            "Curup Bali",
            "Curup Maung",
            "Air Terjun Bedegung",
            "Candi Bumi Ayu",
            "Danau Cinta",
            "Curup Embun",
            "Taman Adipura",
            "Curup Selingsing",
            "Lubuk Putih",
            "Air Terjun Lemutu"};

    String subtitle[] = {"Kebanyakan masjid yang berdiri adalah masjid yang dibangun oleh pemerintah atau sebuah yayasan keagamaan, tapi sepertinya bukan untuk Masjid Al Baniah.",
            "Air Terjun yang memiliki ketinggian 20 meter ini memiliki debit air yang cukup besar, serta kolamnya yang bakal memikat siapapun untuk nyebur",
            "Air Terjun Maung yang lebih dikenal dengan nama Curup Maung yang terletak di Desa Rinduhati, Kecamatan Gumay Ulu, Kabupaten Lahat, Sumatera Selatan",
            "Air Terjun Bedegung yang juga dikenal dengan sebutan Curup Tenang Bedegung oleh masyarakat sekitar.",
            "Candi Bumi Ayu merupakan candi peninggalan Hindu yang berjumlah sekitar 11 buah candi di dalam satu Kompleks percandian dan baru sekitar 4 buah candi yang baru selesai dipugar.",
            "Destinasi wisata di Muara Enim ini seperti menceritakan sebuah percintaan karena namanya Danau Cinta.",
            "Curup Embun bisa jadi merupakan salah satu air terjun yang paling sering dikunjungi wisatawan di Bumi Basemah, Pagaralam",
            "Taman Adipura Muara Enim yang berada di Kolam Retensi Jalan Lintas Sumatera Muara Enim saat ini menjadi tempat favorit dan destinasi wisata baru bagi masyarakat Muara Enim",
            "Air terjun Selingsing terletak di Desa tanjung Agung, sekitar 40 kilometer dari pusat kota Muara Enim. Meskipun ketinggiannya hanya 15 meter, panorama objek wisata ini tetaplah sayang dilewatkan.",
            "Yang paling menarik ketika kamu berada di sini adalah bisa selfie di atas perahu milik warga, atau bisa juga keliling sungai menikmati indahanya alam pedesaan.",
            "Air terjun lemutu di desa pagar dewa, kecamatan tanjung agung, merupakan salah satu objek wisata yang masih hijau dan sangat asri"};

    int gambar[] = { R.drawable.albaniah,
                     R.drawable.bali,
                     R.drawable.maung,
                     R.drawable.bedegung,
                     R.drawable.candi,
                     R.drawable.cinta,
                     R.drawable.embun,
                     R.drawable.adipura,
                     R.drawable.selinsing,
                     R.drawable.lubuk_putih,
                     R.drawable.lemutu};

    String detail[] = { "Kebanyakan masjid yang berdiri adalah masjid yang dibangun oleh pemerintah atau sebuah yayasan keagamaan, tapi sepertinya bukan untuk Masjid Al Baniah. Masjid ini disinyalir menelan biaya sekitar 10 miliar yang dibangun pribadi oleh pemiliki perusahaan PT. Baniah Rahmat Utama, yakni M Teguh. Yang sangat unik dengan masjid ini sehingga menjadi tempat wisata di Sumatera Selatan khususnya wisata religi adalah adanya 5 kubah yang berwarna-warni. Jumlah 5 kubah yang menggambar kewajiban sholat 5 kali dalam sehari dipadukan dengan warna putih pada dinding masjid tampak begitu cantik untuk dilihat. Untuk lokasinya sendiri terletak di Desa dan Kecamatan Ujanmas.",
            "Air Terjun yang memiliki ketinggian 20 meter ini memiliki debit air yang cukup besar, serta kolamnya yang bakal memikat siapapun untuk nyebur. Airnya yang sangat jernih, pepohonan yang rindang, serta perpaduan bebatuan alama yang tertata alami menjadi sajian utama di tempat wisata di Sumatera Selatan ini. Jarak air terjun dari Kota Muara Enim sekitar 45 km, dan dari Desa Lebak Budi yang masih di wilayah Kecamatan Tanjung Agung membutuhkan setidaknya 1 jam perjalanan dengan sedikit mendaki dan menyibak lebatnya hutan.",
            "Lahat merupakan salah satu kabupaten Provinsi Sumatera Selatan yang menyimpan potensi wisata yang menakjubkan. Salah satunya adalah Air Terjun Maung yang lebih dikenal dengan nama Curup Maung yang terletak di Desa Rinduhati, Kecamatan Gumay Ulu, Kabupaten Lahat, Sumatera Selatan, dengan jarak sekitar 25 kilometer dari pusat kota Lahat atau 220 kilometer dari pusat Kota Palembang. Air terjun ini merupakan pilihan untuk menghabiskan liburan yang menyenangkan.",
            "Air Terjun Bedegung yang juga dikenal dengan sebutan Curup Tenang Bedegung oleh masyarakat sekitar. Cukup menyenangkan perjalanan menuju lokasi air terjun, melewati persawahan dan juga melihat pepohonan yang besar menjulang tinggi yang diselimuti udara sejuk khas pegunungan. Hanya membutuhkan waktu sekitar 30 menit dari desa terdekat dan medan yang dilalui memang cukup menanjak tapi ada tangga yang memudahkan kita untuk melewatinya. Eksotismenya sungguh terlihat air terjun dengan ketinggian 99 meter yang diapit tebing nan tinggi dengan hijaunya pepohonan di setiap sisinya. Kamu bisa menikmati keindahan Air Terjun Bedegung di jembatan besi tepat di depannya atau sembari menikmati segarnya air di aliran sungainya yang begitu banyak spot untuk berendam. Lokasi Air Terjun Bedegung ini berada di Desa Bedegung dan berada di wilayah Kecamatan Tanjung Agung.",
            "Merupakan Kompleks Candi satu-satunya yang ada di Provinsi Sumatera Selatan yang terletak di Desa Siku, Kecamatan Rambang Dangku. Candi Bumi Ayu merupakan candi peninggalan Hindu yang berjumlah sekitar 11 buah candi di dalam satu Kompleks percandian dan baru sekitar 4 buah candi yang baru selesai dipugar. Hampir keseluruahan candi dibuat dengan menggunakan batu bata dan juga ada beberapa arca seperti Arca Siwa Mahaguru, Arca Argastya, dan beberapa arca lainnya. Cagar budaya yang dimiliki oleh Kabupaten Muara Enim ini menjadi tempat wisata di Sumatera Selatan yang cukup ramai dikunjungi wisatawan dan juga para peneliti.",
            "Luasnya sekitar 12 hektar yang dikelilingi perbukitan nan hijau dipenuhi pepohonan semakin tampak jelas begitu asrinya tempat wisata di Sumatera Selatan ini. Air danau yang terlihat membiru semakin menambah eksotisme Danau Deduhuk. Kamu bisa bersantai di pinggiran danau atau menikmati keindahan danau dengan menggunakan rakit untuk berkeliling tidap sudut danau. Atau kamu bisa mencoba sensasi strike ikan tawar yang menghuni Danau Deduhuk yang ukurannya cukup besar-besar. untuk menuju lokasi danau memang tergolong tidak mudah terutama akses jalannya yang cukup buruk tetapi pesona alamnya tidak akan membuat bosan perjalanan kamu yang selama 4 jam jika dari pusat Kota Muara Enim. Lokasi Danau Deduhuk ini berada di Desa Rantau Dedap, dan masih di wilayah Kecamatan Semende Darat Ulu.",
            "Curup Embun bisa jadi merupakan salah satu air terjun yang paling sering dikunjungi wisatawan di Bumi Basemah, Pagaralam. Curup Embun berlokasi tidak jauh dari pusat Kota Pagaralam,  tepatnya di Kelurahan Curup Jare, Kecamatan Pagaralam Utara. Sebelum masuk ke wilayah Curup Embun, pengunjung akan disambut panorama perkebunan teh dan juga beberapa anak tangga yang bersusun rapi. Berbeda dengan Curup Temam yang lebar namun tidak terlalu tinggi, aliran air Curup Embun lebih sempit dan jauh lebih tinggi. Meski demikian, mata air di dasar Curup Embun relatif aman dan bisa dijadikan tempat mandi oleh para wisatawan.",
            "Taman Adipura Muara Enim yang berada di Kolam Retensi Jalan Lintas Sumatera Muara Enim saat ini menjadi tempat favorit dan destinasi wisata baru bagi masyarakat Muara Enim untuk menghabiskan waktu senggangnya sambil berolah raga, bermain, dan bahkan nongkrong serta makan-makan di lokasi tersebut. Dengan banyaknya masyarakat berkunjung ke lokasi tersebut menimbulkan giat perekonomian baru di Bumi Serasan Sekundang. Tampak dari pantauan media ini banyak sekali fasilitas yang disediakan oleh masyarakat sekitar buat para pengunjung untuk menghabiskan waktu senggangnya di sore hari ataupun hari libur seperti permainan anak-anak, pusat Jajan, fasilitas jogging, dan bahkan lokasi untuk berphoto selfie bagi para remaja.",
            "Air terjun Selingsing terletak di Desa tanjung Agung, sekitar 40 kilometer dari pusat kota Muara Enim. Meskipun ketinggiannya hanya 15 meter, panorama objek wisata ini tetaplah sayang dilewatkan. Lanskap hutan yang rimbun merupakan berkah yang layak disyukuri, karena akses jalan ke lokasi air terjun ini cukup menguras tenaga. Daya tarik utama curup selingsing adalah bentuk dasar sungan yang berasal dari padatan batubara. Padatan ini berbeda dengan batu atau tanah, sehingga anda tidak perlu khawatir terpeleset saat berfoto disini",
            "Ingin menikmati indahnya aliran sungai yang berpadu dengan tebing yang menjulang tinggi? Datang saja ke Lubuk Outih yang terletak di Desa Seleman, Kecamatan Tanjung Agung. Inilah salah satu destinasi favorit wisatawan yang ada di Kabupaten Muara Enim. Selain aksesnya yang mudah untuk dijangkau pesona alamnya benar-benar instagramable banget. Yang paling menarik ketika kamu berada di sini adalah bisa selfie di atas perahu milik warga, atau bisa juga keliling sungai menikmati indahanya alam pedesaan. Dan yang pasti menikmati segarnya air Lubuk Putih sudah menjadi kewajiban para traveler yang mendatangi tempat wisata di Sumatera Selatan ini.",
            "Air terjun lemutu di desa pagar dewa, kecamatan tanjung agung, merupakan salah satu objek wisata yang masih hijau dan sangat asri. ciri khas Curup Lemutu adalah pesona undakan yang membuat laju air semakin menggoda untuk dipotret. Akan tetapi, objek wisata yang asri ini tampaknya masih memerlukan banyak perbaikan fasilitas, agar pengunjung semakin nyaman"};

    String lokasi[] = {"Desa Ujan Mas Lama, Kecamatan Ujan Mas, Kabupaten Muaraenim, Sumatera Selatan",
            "Desa Lebak Budi, Kecamatan Tanjung Agung, Kabupaten Muara Enim, Provinsi Sumatera Selatan",
            "perbatasan Kota Pagar Alam dan Kabupaten Lahat, Sumatera Selatan.",
            "Desa Bedegung, Kecamatan Tanjung Agung, Kabupaten Muara Enim, Sumatera Selatan",
            "Bumiayu, Tanah Abang, Muara Enim, Kabupaten Muara Enim, Sumatera Selatan",
            "Tanjung Enim Selatan, Lawang Kidul, Darmo, Muara Enim, Kabupaten Muara Enim, Sumatera Selatan",
            "Kelurahan Curup Jare, Kecamatan Pagaralam Utara",
            "Muara Enim, Kecamatan Muara Enim, Kabupaten Muara Enim, Muara Enim, Sumatera Selatan",
            "Jl. Talang Abik, Tj. Agung, Kabupaten Muara Enim, Sumatera Selatan",
            "Desa Seleman, Kecamatan Tanjung Agung, Kabupaten Muara Enim, Sumatera Selatan",
            "Pagar Dewa, Tanjung Agung, Muara Enim, Kabupatèn Muara Enim, Sumatera Selatan"};
    Context context;
    LayoutInflater layoutInflater;

    public RecyclerViewAdapter(Context context){
        this.context = context;
        layoutInflater = layoutInflater.from(context);
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        MyHolder holder = new MyHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.MyHolder holder, final int position) {
        holder.txt.setText(nama[position]);
        holder.subtitle.setText(subtitle[position]);
        holder.img.setImageResource(gambar[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent kirimData = new Intent(context, DetailActivity.class);
                kirimData.putExtra("Nama", nama[position]);
                kirimData.putExtra("IMG", gambar[position]);
                kirimData.putExtra("DET", detail[position]);
                kirimData.putExtra("LOK", lokasi[position]);
                context.startActivity(kirimData);
            }
        });

    }

    @Override
    public int getItemCount() {
        return nama.length;
    }

    public class MyHolder extends RecyclerView.ViewHolder {

        ImageView img;
        TextView txt;
        TextView subtitle;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            img = (ImageView)itemView.findViewById(R.id.imglist);
            txt = (TextView)itemView.findViewById(R.id.txtlist);
            subtitle = (TextView)itemView.findViewById(R.id.txtsubtitle);
        }
    }
}
