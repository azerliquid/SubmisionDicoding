package com.example.football;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView list;
    Toolbar toolbar;
    ImageButton profile;

    String[] teamNames = {
            "FC Barcelona",
            "Real Madrid C.F.",
            "Chelsea F.C.",
            "Manchester United F.C.",
            "Paris Saint-Germain",
            "FC Bayern München",
            "Arsenal F.C.",
            "Atlético de Madrid",
            "Manchester City F.C.",
            "A.C. Milan",
            "Juventus F.C.",
            "F.C. Internazionale Milano"
    };

    String[] teamJulukan = {
            "Blaugrana",
            "Los Blancos",
            "The Blues",
            "The Red Devils",
            "Les Parisiens ",
            "FC Hollywood",
            "The Gunners",
            "Los Colchoneros",
            "The Citizens",
            "i Rossoneri",
            "[La] Vecchia Signora",
            "I Nerazzurri"
    };

    String[] teamDetails = {
            "Fútbol Club Barcelona, juga dikenal sebagai Barcelona atau Barça, adalah klub sepak bola profesional yang berbasis di Barcelona, Catalunya, Spanyol. Didirikan pada tahun 1899 oleh sekelompok pemain Swiss, Inggris dan Catalan yang dipimpin oleh Joan Gamper, klub telah menjadi simbol budaya Catalan dan Catalanisme, yang mempunyai motto Més que un club (Lebih dari sebuah klub). Tidak seperti banyak klub sepak bola lainnya, para pendukung memiliki dan mengoperasikan Barcelona. Ia adalah klub sepak bola kedua terkaya di dunia dalam hal pendapatan, dengan omset tahunan sebesar €560,8 juta dan kedua yang paling berharga, senilai $3,56 miliar.Lagu kebangsaan resmi Barcelona adalah Cant del Barça, yang ditulis oleh Jaume Picas dan Josep Maria Espinas.",
            "Real Madrid Club de Fútbol (pengucapan bahasa Spanyol: [reˈal maˈðɾið ˈkluβ ðe ˈfutβol]; Royal Madrid Football Club), umumnya dikenal sebagai Real Madrid, adalah klub sepak bola profesional yang berbasis di Madrid, Spanyol. Didirikan pada tahun 1902 sebagai Madrid Football Club, secara tradisional mengenakan kostum kandang putih. Kata Real (dari kerajaan) Spanyol dan dianugerahkan ke klub oleh Raja Alfonso XIII pada tahun 1920 bersama-sama dengan mahkota kerajaan di lambang klub. Klub ini telah memainkan pertandingan kandang di Stadion Santiago Bernabéu dengan kapasitas 85.454 di pusat kota Madrid sejak tahun 1947.",
            "Chelsea Football Club adalah sebuah klub sepak bola Inggris yang bermarkas di Fulham, London. Chelsea didirikan pada tahun 1905 dan kini berkompetisi di Liga Utama Inggris. Kesuksesan pertama Chelsea diraih saat meraih gelar juara liga pada tahun 1955. Beberapa gelar dari berbagai kompetisi juga berhasil diraih pada dekade 1960an, 1970an, 1990an, dan 2000an. Sepanjang sejarah penampilan dalam dunia sepak bola di Inggris dan Eropa, Chelsea telah meraih enam gelar juara Liga Utama Inggris, delapan Piala FA, lima Piala Liga, dua Liga Eropa UEFA, dua Piala Winners UEFA, satu Liga Champions UEFA, dan satu Piala Super UEFA.[3] Dalam dua dekade terakhir merupakan periode terbaik kesuksesan Chelsea dengan meraih lebih dari 30 gelar sejak tahun 1997, termasuk untuk pertama kali meraih gelar ganda, Liga Utama Inggris dan Piala FA pada tahun 2010 serta gelar juara Liga Champions UEFA pada tahun 2012 dan Liga Eropa UEFA pada 2013 dan 2019",
            "Manchester United Football Club adalah sebuah klub sepak bola profesional Inggris yang berbasis di Old Trafford, Manchester Raya, yang bermain di Liga Inggris. Didirikan sebagai Newton Heath LYR Football Club pada tahun 1878, klub ini berganti nama menjadi Manchester United pada 1902 dan pindah ke Old Trafford pada tahun 1910. Manchester United telah memenangkan banyak trofi di sepak bola Inggris, termasuk rekor 20 gelar Liga, 12 Piala FA, empat Piala Liga dan rekor 21 FA Community Shield. Klub ini juga telah memenangkan tiga Piala Eropa, satu Piala UEFA, satu Piala Winners UEFA, satu Piala Super UEFA, satu Piala Interkontinental dan satu Piala Dunia Antarklub FIFA. Pada 1998-1999, klub memenangkan treble dari Liga Premier, Piala FA dan Liga Champions, prestasi belum pernah terjadi sebelumnya untuk klub Inggris.",
            "Paris Saint-Germain Football Club (pengucapan bahasa Prancis: [paʁi sɛ̃ ʒɛʁmɛ̃]) atau dikenal luas dengan sebutan PSG merupakan sebuah tim sepak bola Prancis yang bermain di Ligue 1, Prancis. Bermarkas di Paris, Prancis. Klub ini didirikan pada 12 Agustus 1970, berkat penggabungan Paris FC dan dengan Stade Saint-Germain.",
            "Fußball-Club Bayern München e.V., juga dikenal sebagai FC Bayern München (pengucapan bahasa Jerman: [ʔɛf ˈt͡seː ˈbaɪ̯ɐn ˈmʏnçən]), FC Bayern Munich, atau FC Bayern, adalah sebuah klub olahraga Jerman yang berbasis di München, Bavaria. Hal ini terkenal karena tim sepak bola profesional, yang bermain di Bundesliga, peringkat teratas sistem liga sepak bola Jerman, dan merupakan klub paling sukses dalam sejarah sepak bola Jerman, setelah memenangkan rekor 29 gelar nasional dan 19 piala nasional. FC Bayern didirikan pada tahun 1900 oleh sebelas pemain sepak bola yang dipimpin oleh Franz John. Meskipun Bayern memenangkan kejuaraan nasional pertamanya pada tahun 1932, klub tersebut tidak dipilih untuk Bundesliga pada awal tahun 1963. Klub memiliki periode yang sukses terbesar di tengah tahun 1970-an, di bawah kapten dari Franz Beckenbauer, memenangkan Piala Eropa tiga kali berturut-turut (1974-1976). Secara keseluruhan, Bayern telah mencapai sepuluh final Piala Eropa/Liga Champions, yang terakhir memenangkan gelar kelima mereka pada tahun 2013 sebagai bagian dari treble benua. Bayern juga telah memenangkan satu Piala UEFA, satu Piala Winners UEFA, satu Piala Super UEFA, dua Piala Interkontinental dan satu Piala Dunia Antarklub FIFA, membuatnya menjadi salah satu klub Eropa yang paling sukses di dunia. Sejak pembentukan Bundesliga, Bayern telah menjadi klub yang dominan dalam sepak bola Jerman dengan 28 gelar dan telah memenangkan 10 dari 14 gelar terakhir. Mereka memiliki persaingan lokal tradisional dengan TSV 1860 München dan 1. FC Nürnberg, serta persaingan kontemporer dengan Borussia Dortmund.",
            "Arsenal Football Club (dikenal pula sebagai Arsenal atau The Gunners) adalah klub sepak bola profesional Inggris yang berbasis di daerah Holloway, London. didirikan pada 1886 dengan nama Dial Square. Klub ini bermain di Liga Utama Inggris yang termasuk salah satu klub tersukses di sepak bola Inggris, yang telah memenangkan 13 gelar kasta utama Liga Inggris (10 pada era Divisi Pertama dan 3 pada era Premier League) dan 13 gelar di Piala FA (Gelar paling banyak). Arsenal memegang rekor untuk periode terpanjang berada di kasta puncak Liga Inggris tanpa pernah terdegradasi sejak musim 1919 dan menjadi tim pada peringkat pertama dalam klasemen Liga Inggris sepanjang abad ke-20. Arsenal menjadi tim kedua di Inggris yang menyelesaikan semusim liga tanpa kalah (musim 2003–04) dan tim pertama yang melakukannya pada era di mana satu musim berlangsung 38 pertandingan.",
            "Atlético Madrid memiliki sejarah yang berhubungan dengan Athletic Club Bilbao. Pada 1903 Atlético Madrid didirikan oleh pelajar dan mahasiswa dari Basque Country yang merantau di Kota Madrid, klub ini kemudian berpisah dari induknya di Bilbao pada 1920 dan memiliki nama Athletic Madrid. Maka tak heran jika lambang dan jersey Atlético Madrid dengan Athletic Club Bilbao memiliki desain yang sama. Pada masa Perang Saudara 1936–1939, atas perintah Jenderal Francesco Franco, Athletic Madrid yang berisi orang-orang Basque diakuisisi oleh rezim dan di likuidasi dengan klub sepak bola milik Angkatan Udara Spanyol, Athletic Aviacion de Madrid. Pada 1940 akhirnya secara resmi mengganti nama menjadi Atlético de Madrid.",
            "Manchester City Football Club (dikenal pula sebagai Man City atau The Citizens) adalah sebuah klub sepak bola profesional dari Inggris yang bermain di Liga Premier Inggris. Klub ini merupakaan klub sekota dengan Manchester United dan bermarkas di Stadion Etihad, Manchester. Pertandingan pertama dimainkan pada bulan November 1880. Pada saat itu masih bernama St Mark's (West Gorton). Pada tahun 1887 berubah nama menjadi Ardwick A.F.C, dan pada tahun 1894 menjadi Manchester City F.C. Manchester City telah memenangi Liga Inggris sebanyak 4 kali, Piala FA 5 kali, Piala Liga Inggris 4 kali, dan Piala Winners Eropa 1 kali. Periode tersukses klub ini terjadi pada era akhir tahun 1960-an dan awal 1970-an. Pada saat itu City di bawah asuhan manager Joe Mercer dengan asistennya Malcolm Allison dan beberapa pemain seperti Colin Bell, Mike Summerbee dan Francis Lee.",
            "Associazione Calcio Milan (pengucapan bahasa Italia: [assotʃatˈtsjoːne ˈkaltʃo ˈmiːlan]), sering disebut sebagai A.C. Milan atau hanya Milan, adalah sebuah klub sepak bola Italia yang berbasis di Milan, Lombardia, yang bermain di Serie A. Mereka bermain dengan seragam bergaris merah-hitam dan celana putih (kadang-kadang hitam), sehingga dijuluki rossoneri (merah-hitam). Milan adalah tim tersukses kedua dalam sejarah persepak bolaan Italia, menjuarai Serie A 18 kali dan Piala Italia 5 kali. AC Milan adalah klub tersukses ke-4 di dunia sepak bola dalam hal jumlah piala internasional bersama Boca Juniors dengan 18 gelar resmi dari UEFA dan FIFA dibawah Real Madrid, FC Barcelona, dan Al-Ahly. Milan telah memenangkan rekor tiga Piala Interkontinental dan setelah penggantinya, Piala Dunia Antarklub FIFA. Milan juga memenangkan Piala Liga Eropa/Champions tujuh kali. yang kedua setelah Real Madrid. Mereka juga memenangkan rekor Piala Super UEFA lima kali dan Piala Winners UEFA dua kali. Milan memenangkan setiap kompetisi besar di mana ia telah berkompetisi, terkecuali untuk Liga Eropa UEFA (dalam kompetisi ini mereka telah kehilangan dua semifinal pada tahun 1972 dan pada tahun 2002). Secara domestik, dengan 18 gelar liga. Milan adalah gabungan kedua klub paling sukses di Serie A di belakang Juventus (31 gelar), bersama dengan rival lokal Inter. Mereka juga telah memenangkan Coppa Italia lima kali, serta rekor enam kemenangan Supercoppa Italiana",
            "Juventus Football Club S.p.A. (BIT: JUVE) (dari bahasa Latin: iuventus: masa muda [juˈvɛntus]), biasa disebut sebagai Juventus dan populer dengan nama Juve (pengucapan [ˈjuːve]), adalah klub sepak bola profesional asal Italia yang berbasis di Turin, Piemonte. Klub ini didirikan pada tahun 1897 dengan nama Sport Club Juventus oleh sekelompok pelajar muda di kota Turin,[3] yang dipimpin oleh Eugenio Canfari dan saudaranya Enrico. Mereka mengenakan kaos berwarna hitam putih sebagai seragam kandang sejak tahun 1903, dan menggunakan beberapa stadion berbeda di sekitar kota Turin untuk memainkan partai kandang. Sejak bulan September 2011, mereka berkandang di Juventus Stadium yang berkapasitas 41.507 tempat duduk. Stadion tersebut dibangun di lokasi yang sama dengan stadion yang mereka gunakan sebelumnya, yaitu Stadion Delle Alpi, yang harus dirobohkan demi membangun Juventus Stadium.",
            "Football Club Internazionale Milano, atau yang dikenal dengan nama Internazionale (/ˌinternattsjoˈnaːle/) ataupun juga Inter, dan bahasa sehari-hari dikenal sebagai Inter Milan di luar Italia, adalah sebuah klub sepak bola profesional asal Italia yang saat ini bermain di Serie A Liga Italia. Inter Milan mempunyai julukan sebagai il Nerazzurri (si biru hitam), il Biscone (si ular besar), dan juga La Beneamata (yang tersayang). Klub bermain di Serie A (divisi pertama) sejak tahun 1908, dan pendukung Internazionale disebut Interisti. Dari tahun 2006 hingga tahun 2010 adalah tahun pencapaian terbaik kedua bagi Inter sepanjang sejarah sejak berdiri. Dalam kurun waktu tersebut mereka sukses memperoleh lima gelar yaitu Serie A, Coppa Italia, Liga Champions UEFA, Piala Super Italia, dan Piala Dunia Antarklub FIFA."
    };

    int[] teamImages = {
            R.drawable.barcelona,
            R.drawable.real_madrid,
            R.drawable.chelsea,
            R.drawable.manchester_united,
            R.drawable.paris_saint_germain,
            R.drawable.bayern_munchen,
            R.drawable.arsenal,
            R.drawable.atletico_madrid,
            R.drawable.manchester_city,
            R.drawable.ac_milan,
            R.drawable.juventus,
            R.drawable.inter_milan
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.list_view);
        ListAdapter adapter = new ListAdapter(MainActivity.this, teamNames, teamImages, teamJulukan);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Intent pindah = new Intent(MainActivity.this, DetailActivity.class);
                pindah.putExtra("DataNama", teamNames[position]);
                pindah.putExtra("DataGambar", teamImages[position]);
                pindah.putExtra("DetailTeam", teamDetails[position]);
                pindah.putExtra("JulukanTeam", teamJulukan[position]);
                startActivity(pindah);
            }
        });

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        profile = findViewById(R.id.iv_toolbar);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent prof = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(prof);
            }
        });
    }
}
