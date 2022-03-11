package com.unitec.tutorialpruebas

import androidx.test.core.app.launchActivity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestConEspresso {

    @Test
    fun inputTestDebeRetenerseDespuesDeCreacion(){
        val nombreContacto="Juan Carlos"
        val escenario=launchActivity<MiLoginActivity>()
        //Al itroducir el nombre de usuario
        onView(withId(R.id.textoNombre)).perform(typeText(nombreContacto))
        //Destruir y recrear
        escenario.recreate()
        //Checar si el nombre fue recreado
        onView(withId(R.id.textoNombre)).check(matches(withText(nombreContacto)))
    }
}