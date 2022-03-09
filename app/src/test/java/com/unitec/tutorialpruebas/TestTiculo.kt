package com.unitec.tutorialpruebas

import android.content.Intent
import android.widget.Button
import android.widget.TextView
import androidx.test.core.app.ActivityScenario
import junit.framework.Assert.assertEquals

import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.RuntimeEnvironment
import org.robolectric.Shadows.shadowOf

@RunWith(RobolectricTestRunner::class)
class TestTiculo {


 //Probar navegacion de una ativity a la otra.
@Test
fun probarNavegacion(){
    ActivityScenario.ActivityAction<MainActivity> {

        it.findViewById<Button>(R.id.login).performClick()

        val intentEsperado= Intent(it,MiLoginActivity::class.java)
        val intentActual=shadowOf(RuntimeEnvironment.getApplication()).nextStartedActivity

        assertEquals(intentEsperado.component,intentActual.component)

    }
}


  //Este es usando ActivityScenario
    @Test
    fun probarCliqueoVersion1(){

                  ActivityScenario.ActivityAction<MainActivity> {

                      it.findViewById<Button>(R.id.btn_mensajito).performClick()

                      assertEquals("Oprimido", it.findViewById<TextView>(
                          R.id.texto_actualizar).text
                      )
                  }
    }


//Lo Mismo que el de arrriba pero usando Robolectric
    @Test
    fun probarCliqueoVersion2(){
        val activity =Robolectric.setupActivity(MainActivity::class.java)
        activity.findViewById<Button>(R.id.btn_mensajito).performClick()

        assertEquals("Oprimido", activity.findViewById<TextView>(
         R.id.texto_actualizar).text
        )

    }

}