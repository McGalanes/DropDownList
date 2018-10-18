package hakobastvatsatryan.sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import hakobastvatsatryan.DropDrownList

typealias lp = LinearLayout.LayoutParams

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val secondDropDrownList: DropDrownList = findViewById(R.id.second_dropdown_text_view)
		secondDropDrownList.setTitleText(R.string.dropdown_title_text)
		secondDropDrownList.setContentText(R.string.dropdown_content_text)

		val thirdDropdownTextViewSecond = DropDrownList.Builder(this)
				.setTitleTextColorRes(R.color.third_drop_down_text_view_title)
				.setTitleTextRes(R.string.dropdown_title_text)
				.setContentTextColorRes(R.color.third_drop_down_text_view_content)
				.setContentTextRes(R.string.dropdown_content_text)
				.setRegularBackgroundDrawableRes(R.drawable.bg_third_dropdown_text_view_regular)
				.setExpandedBackgroundDrawableRes(R.drawable.bg_third_dropdown_text_view_expanded)
				.build()

		val root: ViewGroup = findViewById(R.id.root_view)
		root.addView(thirdDropdownTextViewSecond, lp(lp.MATCH_PARENT, lp.WRAP_CONTENT).apply {
			resources.getDimension(R.dimen.margin_10).toInt().apply {
				setMargins(this, this, this, this)
			}
		})
	}
}
