package com.mehroz.simple_permissions

interface PermissionCallback {
        fun onPermissionGranted()

        fun onIndividualPermissionGranted(grantedPermission: Array<String>)

        fun onPermissionDenied(deniedPermission: Array<String>)

        fun onPermissionDeniedBySystem()
    }