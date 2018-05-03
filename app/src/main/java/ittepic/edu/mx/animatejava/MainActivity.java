package ittepic.edu.mx.animatejava;

import android.animation.Animator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.Icon);
    }

    public void onButtonClick(View v) {
        imageView.animate()
                .alpha(0)
                .scaleX(2)
                .scaleY(2)
                .scaleXBy(1)
                .scaleYBy(1)
                .setDuration(3000)
                .setListener(new Animator.AnimatorListener() {
                    @Override
                    public void onAnimationStart(Animator animation) {
                        Log.i("Animation", "onAnimationStart");
                    }

                    @Override
                    public void onAnimationEnd(Animator animation) {
                        imageView.animate()
                                .alpha(1)
                                .translationX(200)
                                .translationY(100)
                                .translationY(-200)
                                .rotation(50)
                                .setListener(new Animator.AnimatorListener() {

                                    @Override
                                    public void onAnimationStart(Animator animation) {

                                    }

                                    @Override
                                    public void onAnimationEnd(Animator animator) {
                                        imageView.animate()
                                                .alpha(1)
                                                .translationX(-400)
                                                .rotation(-900)
                                                .setListener(new Animator.AnimatorListener() {
                                                    @Override
                                                    public void onAnimationStart(Animator animator) {

                                                    }

                                                    @Override
                                                    public void onAnimationEnd(Animator animator) {
                                                        imageView.animate()
                                                                .alpha(0)
                                                                .translationX(250)
                                                                .translationY(-200)
                                                                .scaleX(5)
                                                                .scaleY(5)
                                                                .rotation(-900);
                                                    }

                                                    @Override
                                                    public void onAnimationCancel(Animator animation) {

                                                    }

                                                    @Override
                                                    public void onAnimationRepeat(Animator animation) {

                                                    }
                                                });
                                    }

                                    @Override
                                    public void onAnimationCancel(Animator animation) {

                                    }

                                    @Override
                                    public void onAnimationRepeat(Animator animation) {

                                    }
                                });
                    }

                    @Override
                    public void onAnimationCancel(Animator animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animator animation) {

                    }
                });
    }
}

