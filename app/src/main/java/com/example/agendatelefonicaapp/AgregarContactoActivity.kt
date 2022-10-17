package com.example.agendatelefonicaapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class AgregarContactoActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var txtNewContact: TextView

//    Contact Name
    private lateinit var contact_name_edit_text: EditText
    private lateinit var contact_name_text_input_layout: TextInputLayout

    //    Contact phone Number
    private lateinit var contact_phone_edit_text: EditText
    private lateinit var contact_phone_text_input_layout: TextInputLayout

//    botones
    lateinit var btnGuardarContacto: Button
    lateinit var btnCancelarContacto: Button

    var estado: Int = 0

    //SharedPreferences
    lateinit var sharedPreferences: SharedPreferences
    var NAME_FILE:String="configuration"
    lateinit var user:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_contacto)

        // Se agrega la flecha para salir de la actividad
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // Se configura el nombre de la actividad
        title = "Agregar Contacto"

        //Enlazar componentes desde la lógica con la vista
        contact_name_edit_text = findViewById(R.id.contact_name_edit_text)
        contact_phone_edit_text = findViewById(R.id.contact_phone_edit_text)

        contact_name_text_input_layout = findViewById(R.id.contact_name_text_input_layout)
        contact_phone_text_input_layout = findViewById(R.id.contact_phone_text_input_layout)

        txtNewContact=findViewById(R.id.txtNewContact)

        btnGuardarContacto=findViewById(R.id.btnGuardarContacto)
        btnCancelarContacto=findViewById(R.id.btnCancelarContacto)

        sharedPreferences = getSharedPreferences(NAME_FILE, MODE_PRIVATE)
        user = sharedPreferences.getString("USER","").toString()

        // Llamado al procedimiento que configura los botones
        configuracionBotones()
    }

    // Método que permite configurar los botones
    fun configuracionBotones() {
        btnGuardarContacto.setOnClickListener(this)
        btnCancelarContacto.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        when(p0!!.id){
            R.id.btnGuardarContacto->{
                //al dar clic en boton guardar
                // Se configura el oyente del boton guardar
//                saveButton()
//            //se cierra la activity y se redirecciona a la vista del listado
//            intent= Intent(this.applicationContext,MostrarListaContactoVE::class.java)
//            startActivity(intent)
            }
            R.id.btnCancelarContacto->{
                //Al dar clic en el botón “Cancelar”
                // debe borrar el texto o valor de todos los componentes.
                resetVE()}
        }
    }

    private fun resetVE()
    {
        contact_name_edit_text.setText("");
        contact_phone_edit_text.setText("");
        btnGuardarContacto.text = "Save";
        /// ir a la vista MostrarListaContacto
        startActivity(Intent(this.applicationContext, MostrarListaContactoActivity::class.java))

    }

    private fun verifyTextPersonName(editText: EditText): Boolean {
        if (editText.text.toString().isEmpty()){
            editText.error = "Required field"
            editText.requestFocus()
            return false
        } else if (!verifyChars(editText)) {
            editText.error = "Just letters are allowed"
            editText.requestFocus()
            return false
        }
        return true

    }

    fun verifyChars(editText: EditText): Boolean
    {
        //Validamos solo caracteres Expresion regular
//        Pattern.compile("^[a-zA-Z ]+$").matcher(editText.text.toString()).matches()

        return Pattern.compile("^[a-zA-Z ]+$").matcher(editText.text.toString()).matches()
    }
    fun verifyEmpty(editText: EditText): Boolean
    {
        if (editText.text.toString().isEmpty()){
            editText.error = "Required field"
            editText.requestFocus()
            return false
        }
        return true
    }

    // Se configura la flecha para salir de la actividad
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> {
                // Finalizar la actividad
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}