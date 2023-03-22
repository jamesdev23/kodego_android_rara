package ph.kodego.rara.jamesnico.applicationforemployment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.rara.jamesnico.applicationforemployment.databinding.ActivityReferencesBinding

class ReferencesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityReferencesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReferencesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Reference"

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            val goToNextActivity = Intent(this, AcknowledgementActivity::class.java)
            startActivity(goToNextActivity)
        }
    }
}