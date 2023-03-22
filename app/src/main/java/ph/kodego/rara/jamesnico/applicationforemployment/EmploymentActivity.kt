package ph.kodego.rara.jamesnico.applicationforemployment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.rara.jamesnico.applicationforemployment.databinding.ActivityEmploymentBinding

class EmploymentActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEmploymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEmploymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Employment"

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            val goToNextActivity = Intent(this, ReferencesActivity::class.java)
            startActivity(goToNextActivity)
        }
    }
}