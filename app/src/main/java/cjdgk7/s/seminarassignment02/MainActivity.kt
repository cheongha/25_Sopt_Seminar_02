package cjdgk7.s.seminarassignment02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import cjdgk7.s.seminarassignment02.data.InfoItem

class MainActivity : AppCompatActivity() {

    private lateinit var rvMainInfo: RecyclerView
    private lateinit var infoAdapter: InfoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvMainInfo = findViewById(R.id.rv_list_info)

        infoAdapter = InfoAdapter(this)

        rvMainInfo.adapter = infoAdapter

        rvMainInfo.layoutManager = LinearLayoutManager(this)


        infoAdapter.data = listOf(
            InfoItem(
                name = "성청하",
                id = "sch7188"
                //profile = "안녕"
                //,img = ""
            ),
            InfoItem(
                name = "송경희",
                id = "sssoooooo"
            ),
            InfoItem(
                name = "이소희",
                id = "s5.h2"
            ),
            InfoItem(
                name = "신승민",
                id = "greedy0110"
            )

        )

        infoAdapter.notifyDataSetChanged()
    }
}
