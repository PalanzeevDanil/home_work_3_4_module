package com.msaggik.fifthlessonanimalhandbook;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    // создание коллекции контейнера для данных класса Animal
    List<Animal> animals = new ArrayList<Animal>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // инициализируем контейнер
        setInitialData();

        // создадим объект RecyclerView и привяжем к нему соответствующий id
        RecyclerView recyclerView = findViewById(R.id.list_animal);

        // создадим адаптер и загрузим в него контейнер с данными
        AnimalAdapter adapter = new AnimalAdapter(this, animals);

        // на recyclerView подадим адаптер
        recyclerView.setAdapter(adapter);
    }

    // метод setInitialData() устанавливает начальный набор данных (а именно изображения из папки res/drawables)
    private void setInitialData() {
        // добавление в контейнер animals объектов сущности Animal
        animals.add( new Animal("Ламантин", "Ламантины отличаются от " +
                "представителей семейства дюгоневых  формой черепа и хвоста: хвост ламантина имеет форму весла, в то время как хвост дюгоня — форму вилки. На ластах есть плоские ногтеподобные копытца, напоминающие слоновьи. Одной из уникальных черт, объединяющих ламантинов со слонами, является постоянная смена коренных зубов, в целом нехарактерная для млекопитающих. Новые зубы появляются дальше по челюсти и постепенно вытесняют старые и изношенные зубы вперёд. Шейных позвонков у ламантина не семь, как у большинства млекопитающих, а шесть.",
                R.drawable.lamantin, "Численность средняя"));
        animals.add( new Animal("Морской котик", "из семейства ушастых тюленей",
                R.drawable.sea_cat, "Численность большая"));
        animals.add( new Animal("Синий кит", "Семейство млекопитающих из отряда китообразных. Самый большой вид млекопитающих",
                R.drawable.blue_whale, "Численность малая"));
        animals.add( new Animal("Морская свинья", "Вид хищных млекопитающих парвотряда зубастых китов, ранее причислялось к семейству дильфиновых ",
                R.drawable.sea_pig, "Численность большая"));
        animals.add( new Animal("Нарвал", "млекопитающее семейства нарваловых,единственный вид рода нарвалы,имеет бивень напоминающий копье",
                R.drawable.narval, "Численность малая"));
    }
}