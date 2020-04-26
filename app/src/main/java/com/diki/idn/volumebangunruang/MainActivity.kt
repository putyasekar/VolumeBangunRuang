package com.diki.idn.volumebangunruang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val bangunRuang = arrayOf("Balok", "Kerucut", "Kubus", "Prisma", "Tabung")

        if (spinner != null) {
            val arrayAdapter =
                ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, bangunRuang)

            spinner.adapter = arrayAdapter
            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onNothingSelected(p0: AdapterView<*>?) {

                }

                override fun onItemSelected(p0: AdapterView<*>, p1: View?, p2: Int, p3: Long) {
                    when (p0.selectedItem.toString()) {
                        bangunRuang[0] -> {
                            supportFragmentManager.beginTransaction()
                                .replace(
                                    R.id.fm_main,
                                    BalokFragment(),
                                    BalokFragment::class.java.simpleName
                                ).commit()
                        }
                        bangunRuang[1] -> {
                            supportFragmentManager.beginTransaction()
                                .replace(
                                    R.id.fm_main,
                                    KerucutFragment(),
                                    KerucutFragment::class.java.simpleName
                                ).commit()
                        }
                        bangunRuang[2] -> {
                            supportFragmentManager.beginTransaction()
                                .replace(
                                    R.id.fm_main,
                                    KubusFragment(),
                                    KubusFragment::class.java.simpleName
                                ).commit()
                        }
                        bangunRuang[3] -> {
                            supportFragmentManager.beginTransaction()
                                .replace(
                                    R.id.fm_main,
                                    PrismaFragment(),
                                    PrismaFragment::class.java.simpleName
                                ).commit()
                        }
                        bangunRuang[4] -> {
                            supportFragmentManager.beginTransaction()
                                .replace(
                                    R.id.fm_main,
                                    TabungFragment(),
                                    TabungFragment::class.java.simpleName
                                ).commit()
                        }
                    }
                }
            }
        }
    }
}
