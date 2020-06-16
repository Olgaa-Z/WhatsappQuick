package com.whatsapp.ltiquick.ltiquick

import android.content.Intent
import android.content.Intent.ACTION_SENDTO
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException
import android.R.string.cancel
import android.content.DialogInterface
import android.support.v7.app.AlertDialog
import android.support.v4.view.MenuItemCompat.getActionProvider
import android.R.menu
import android.text.util.Linkify
import android.view.MenuItem
import android.widget.*


class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var editnomor : EditText
    lateinit var editpesan : EditText

    private var link: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        link = findViewById(R.id.ipweb) as TextView
//        link!!.text =
//
//                "www.lauwba.com \n"
//        // proses menambahkan Links pada TextView
//        Linkify.addLinks(link, Linkify.ALL)

//        // Inflate the menu; this adds items to the action bar if it is present.
//        menuInflater.inflate(R.menu.menu_item)
//
//        val shareItem = menu.findItem(R.id.action_share) as MenuItem
//
//        val mShare = shareItem.getActionProvider() as ShareActionProvider
//
//        val shareIntent = Intent(Intent.ACTION_SEND)
//        shareIntent.action = Intent.ACTION_SEND
//        shareIntent.type = "text/plain"
//        shareIntent.putExtra(Intent.EXTRA_TEXT, "Text to Share")
//
//        mShare.setShareIntent(shareIntent)
//
//
//        return true


        editnomor = findViewById(R.id.editnomor)
//        editpesan = findViewById(R.id.editpesan)
        button = findViewById(R.id.btnkirim)

        btnkirim.setOnClickListener {
//            val intent = Intent(this@MainActivity,  MainActivity::class.java)
//            startActivity(intent)
//
//
//
//            val pesan = editpesan.text.toString()
////            val nomor = editnomor.text.toString()
//            val semuapesan = "$pesan"
//////            val wa = "$nomor"
//
//            val kirimWA = Intent(Intent.ACTION_SEND)
////            val kirim = Intent(ACTION_SENDTO)
//
//            kirimWA.setType("text/number");
//
//            kirimWA.putExtra(Intent.EXTRA_TEXT, semuapesan);
//
////            Toast.makeText(this, editnomor.text.toString(), Toast.LENGTH_SHORT).show()
//            kirimWA.putExtra("jid",  nomor + "@s.whatsapp.net");
//            kirimWA.setPackage("https://api.whatsapp.com/send?phone=");
//
//
//            startActivity(kirimWA);


             var nomor: String? = null
             var pes: String? = null
//             val pesan = editpesan.text.toString()
//



            try {
                  nomor = editnomor.text.toString()
//                  pes= editpesan.text.toString()

            } catch (e : Exception) {
                e.printStackTrace();
            }



            val url = "https://api.whatsapp.com/send?phone=" + nomor

//            val kirimWA = Intent(Intent.ACTION_SEND)
//            kirimWA.setType("text/plain");
//            kirimWA.putExtra(Intent.EXTRA_TEXT, pes);
//            kirimWA.data= Uri.parse(url)
//            kirimWA.putExtra("jid", url + "@s.whatsapp.net");
//
//            kirimWA.setPackage("com.whatsapp");
//            startActivity(kirimWA);


            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url);
            startActivity(i);



//            val kirimWA = Intent(Intent.ACTION_SEND)
//            kirimWA.setType("text/number");
//            kirimWA.putExtra(Intent.EXTRA_TEXT, pesan);
//            kirimWA.putExtra("jid",  "" + "@s.whatsapp.net");
//            kirimWA.setPackage("https://api.whatsapp.com/send?phone=");
//            startActivity(kirimWA)



        }

        bantuan.setOnClickListener {
            val intent = Intent(this@MainActivity,  Bantuan::class.java)
            startActivity(intent)
        }

    }

    override fun onBackPressed() {
        val builder = AlertDialog.Builder(this)
        builder.setCancelable(false)
        builder.setMessage("Keluar dari Aplikasi?")
        builder.setPositiveButton("Ya", DialogInterface.OnClickListener { dialog, which ->
            //if user pressed "yes", then he is allowed to exit from application
            finish()
        })
        builder.setNegativeButton("Tidak", DialogInterface.OnClickListener { dialog, which ->
            //if user select "No", just cancel this dialog and continue with app
            dialog.cancel()
        })
        val alert = builder.create()
        alert.show()
    }

}


