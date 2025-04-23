package com.instagram.android.utils

import android.content.Context
import android.widget.Toast

class ToastUtils {
    companion object{

        fun showShortToast(ctx: Context, message: String) {
            showToast(ctx, message, Toast.LENGTH_SHORT)
        }

        private fun showToast(ctx: Context, message: String, duration: Int) {
            Toast.makeText(ctx, message, duration).show()
        }
    }
}
