package ph.kodego.rara.jamesnico.applicationforemployment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.rara.jamesnico.applicationforemployment.databinding.ActivityEducationBinding

class EducationActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEducationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEducationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Education"

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            val goToNextActivity = Intent(this, EmploymentActivity::class.java)
            startActivity(goToNextActivity)
        }
    }
}