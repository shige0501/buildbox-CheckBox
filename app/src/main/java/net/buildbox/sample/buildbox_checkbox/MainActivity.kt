package net.buildbox.sample.buildbox_checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sampleCheckBox: CheckBox = findViewById(R.id.sample_checkbox)
        sampleCheckBox.setOnCheckedChangeListener { _, isChecked ->
            val stateMessage = if (isChecked) "選択されました" else  "選択解除されました"
            Toast.makeText(this, "チェックボックスが $stateMessage", Toast.LENGTH_SHORT).show()
        }
    }
}
