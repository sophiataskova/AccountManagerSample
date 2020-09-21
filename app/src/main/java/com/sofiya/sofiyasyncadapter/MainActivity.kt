package com.sofiya.sofiyasyncadapter

import android.accounts.Account
import android.accounts.AccountManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val accountType = "com.reddit.account"

        val am = AccountManager.get(this) // "this" references the current Context
        val accounts = am.getAccountsByType(accountType)

        Account("username", accountType).also { account ->
            am.addAccountExplicitly(account, "password", null)
        }
    }
}