package ph.kodego.rara.jamesnico.applicationforemployment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.rara.jamesnico.applicationforemployment.databinding.ActivityPersonalInfoBinding

class PersonalInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPersonalInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPersonalInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.title = "Personal Info"

        binding.btnBack.setOnClickListener {
            onBackPressed()
        }

        binding.btnNext.setOnClickListener {
            val goToNextActivity = Intent(this, PersonalInfoSecondActivity::class.java)
            startActivity(goToNextActivity)
        }
    }
}