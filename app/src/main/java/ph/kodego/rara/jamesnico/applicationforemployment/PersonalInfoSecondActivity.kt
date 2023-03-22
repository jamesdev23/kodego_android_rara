package ph.kodego.rara.jamesnico.applicationforemployment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.rara.jamesnico.applicationforemployment.databinding.ActivityPersonalInfoSecondBinding

class PersonalInfoSecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonalInfoSecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonalInfoSecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Personal Info - Part 2"

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            val goToNextActivity = Intent(this, EducationActivity::class.java)
            startActivity(goToNextActivity)
        }
    }
}