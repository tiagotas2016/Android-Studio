package tiagotas.com.br.trabalhandocommp;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.media.AudioManager;
import android.media.SoundPool;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Aqui começo o codigo MP

    MediaPlayer mp = new MediaPlayer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
   //Aqui vai o codigo do botão tocar
    public void tocar(View view) {
        try {
            mp.stop(); //Parar todos os sons anteriores
            mp = MediaPlayer.create(this, R.raw.quatro); //localizando o arquivo
            mp.start(); //Iniciar o som
            mp.setLooping(true); //Repetir ou não o som;
        } finally {
        }
    }
}