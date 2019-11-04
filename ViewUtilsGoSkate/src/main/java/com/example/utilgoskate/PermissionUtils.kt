package com.example.utilgoskate

import android.content.pm.PackageManager
import android.os.Build
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.fragment.app.FragmentActivity

class PermissionUtils(val activity: FragmentActivity) {
    fun checkPermission(permission: String): Boolean {


        return ActivityCompat.checkSelfPermission(activity,permission) == PackageManager.PERMISSION_GRANTED
    }

    @RequiresApi(Build.VERSION_CODES.M)
    fun requestPermission(arrayOf: Array<String>, requestCode: Int) {

        activity.requestPermissions(arrayOf,requestCode)
    }
}