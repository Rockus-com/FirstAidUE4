package com.app.truehelper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonLeave(View v){ setContentView(R.layout.activity_main); } // Кнопка, отвечающая за выход в главное меню

    /* Начало кнопок потери создания */
    public void LOCGo(View v){ setContentView(R.layout.loc_main); } // Кнопка, которая перекидывает на страницу Потери сознания
    public void LOCHavePulse(View v){ setContentView(R.layout.loc_have_pulse); } // Потеря сознания, если есть пульс
    public void LOCNoPulse(View v){ setContentView(R.layout.loc_no_pulse); } // Потеря сознания, если нету пульса
    public void LOCLeave(View v){ setContentView(R.layout.loc_main); } // Кнопка, отвечающая за выход в главное меню Потери Сознания
    /* Конец кнопок потери сознания */

    /* Начало кнопок кровотечения */
    public void bloodGo(View v){ setContentView(R.layout.blood_main); } // Кнопка, которая перекидывает на страницу Кровотечения
    public void bloodNose(View v){ setContentView(R.layout.blood_nose); } // Кровотечение из носа
    public void bloodVein(View v){ setContentView(R.layout.blood_vein); } // Кровотечение из вены
    public void bloodArtery(View v){ setContentView(R.layout.blood_artery); } // Кровотечение из артерии
    public void bloodLeave(View v){ setContentView(R.layout.blood_main); } // Кнопка, отвечающая за выход в главное меню Кровотечения
    /* Конец кнопок кровотечения */

    /* Начало кнопок при ожоге */
    public void burnGo(View v){ setContentView(R.layout.burn_main); } // Кнопка, которая перекидывает на страницу Ожогов
    public void burnDegree(View v){ setContentView(R.layout.burn_degree); } // Степени ожогов
    public void burnLeave(View v){ setContentView(R.layout.burn_main); } // Кнопка, отвечающая за выход в главное меню Ожогов
    /* Конец кнопок при ожоге */

    /* Начало кнопок при переломе */
    public void fractureGo(View v){ setContentView(R.layout.fracture_main); } // Кнопка, которая перекидывает на страницу Переломов
    public void fractureTips(View v){ setContentView(R.layout.fracture_tips); } // Виды переломов
    public void fractureOpen(View v){ setContentView(R.layout.fracture_open); } // Открытый перелом
    public void fractureClosed(View v){ setContentView(R.layout.fracture_closed); } // Закрытый перелом
    public void fractureLeave(View v){ setContentView(R.layout.fracture_main); } // Кнопка, отвечающая за выход в главное меню Переломов
    /* Конец кнопок при переломе */

    /* Начало кнопок при укусе змеи */
    public void snakeGo(View v){ setContentView(R.layout.snake_main); } // Кнопка, которая перекидывает на страницу Укуса змеи
    /* Конец кнопок при укусе змеи */

    /* Начало кнопок при укусе клеща */
    public void miteGo(View v){ setContentView(R.layout.mite_main); } // Кнопка, которая перекидывает на страницу Укуса клеща
    /* Конец кнопок при укусе клеща */

    /* Начало кнопок пищевого отравления */
    public void poisoningGo(View v){ setContentView(R.layout.poisoning_main); } // Кнопка, которая перекидывает на страницу Пищевого отравления
    /* Конец кнопок пищевого отравления */
}