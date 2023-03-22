package ph.kodego.rara.jamesnico.applicationforemployment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import ph.kodego.rara.jamesnico.applicationforemployment.databinding.ActivityAcknowledgementBinding

class AcknowledgementActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAcknowledgementBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAcknowledgementBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Acknowledgement and Authorization"

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnSubmit.setOnClickListener {
            val builder = AlertDialog.Builder(this)

            builder.setTitle("Application Submitted")
            builder.setMessage("Your application has been submitted successfully.")
            builder.setPositiveButton("OK") { _, _ ->
                // Navigate back to the main activity when the user clicks OK
                val goToMain = Intent(this, MainActivity::class.java)
                goToMain.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
                startActivity(goToMain)
            }

            val dialog = builder.create()
            dialog.show()
        }
    }
}