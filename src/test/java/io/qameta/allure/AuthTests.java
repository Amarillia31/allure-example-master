package io.qameta.allure;

import org.junit.jupiter.api.*;

import static io.qameta.allure.Allure.step;

public class AuthTests {

    @Test
    @AllureId("11010")
    @DisplayName("Авторизация через Google")
    @Tags({@Tag("High"), @Tag("web"),@Tag("Google") })
    @Story("Авторизация через сторонние системы")
    @Owner("allure8")
    @Feature("Авторизация")
    public void testGoogleAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Google");
        step("Авторизуемся как пользователь 'Mr.Random'", () -> {
            step("Вводим логин 'random-user' ");
            step("Вводим пароль 'random-pass' ");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из Google", () -> {
            step("Имя 'Mr.Random'");
            step("Login 'random-user'");
            step("Аватарка");
        });
        step("Разлогиниваемся");
    }

    @Test
    @AllureId("11029")
    @DisplayName("Авторизация через Facebook")
    @Tags({@Tag("High"), @Tag("web"), @Tag("Facebook")})
    public void testFacebookAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через Facebook");
        step("Авторизуемся как пользователь Test User\"", () -> {
            step("Вводим логин test@gmail.com");
            step("Вводим пароль 12398123981231");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GoogleFacebook", () -> {
            step("Имя Test User");
            step("Login Test User ");
            step("Авататарка");
        });
        step("Разлогиниваемся");
    }
    @Test
    @DisplayName("Авторизация через GitHub")
    @Tags({@Tag("blocker"), @Tag("web")})
    @Story("Авторизация через сторонние системы")
    @Feature("Авторизация")
    public void testGitHubAuth() {
        step("Открываем главную страницу");
        step("Нажимаем кнопку Авторизация");
        step("Выбираем способ авторизации через GitHub");
        step("Авторизуемся как пользователь user_name", () -> {
            step("Вводим логин user_login");
            step("Вводим пароль user_password");
            step("Нажимаем кнопку Войти");
        });
        step("Должны оказаться на главной странице сайта");
        step("Профиль пользователя должен быть заполнен из GitHub", () -> {
            step("Имя user_name");
            step("Login user_login");
        });
        step("Разлогиниваемся");
    }
}