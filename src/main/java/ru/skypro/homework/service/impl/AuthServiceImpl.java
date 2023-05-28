package ru.skypro.homework.service.impl;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.stereotype.Service;
import ru.skypro.homework.dto.RegisterReq;
import ru.skypro.homework.dto.Role;
import ru.skypro.homework.service.AuthService;

/**
 * Класс AuthServiceImpl представляет собой сервис для аутентификации и регистрации пользователей, который
 * использует UserDetailsManager и PasswordEncoder для управления пользователями и кодирования паролей соответственно.
 */
@Service
public class AuthServiceImpl implements AuthService {

  private final UserDetailsManager manager;

  private final PasswordEncoder encoder;


//Конструктор класса AuthServiceImpl принимает два параметра: UserDetailsManager и PasswordEncoder,
// которые будут использоваться для управления пользователями и кодирования паролей соответственно.
  public AuthServiceImpl(UserDetailsManager manager, PasswordEncoder passwordEncoder) {
    this.manager = manager;
    this.encoder = passwordEncoder;
  }



//Метод login используется для проверки данных аутентификации пользователя.
// Проверяется существование пользователя в UserDetailsManager и совпадение введённого пароля с захешированным паролем
// пользователя. Если пользователь не существует или пароли не совпадают, метод возвращает false.
  @Override
  public boolean login(String userName, String password) {
    if (!manager.userExists(userName)) {
      return false;
    }
    UserDetails userDetails = manager.loadUserByUsername(userName);
    return encoder.matches(password, userDetails.getPassword());
  }


  //Метод register используется для регистрации нового пользователя. Сначала он проверяет, существует ли пользователь с
  // таким именем в UserDetailsManager, и если да, возвращает false. Затем создаётся новый пользователь с помощью
  // UserDetailsManager, указывая соответствующие поля, включая имя пользователя, пароль и роль.
  // После успешного создания пользователя метод возвращает true.
  @Override
  public boolean register(RegisterReq registerReq, Role role) {
    if (manager.userExists(registerReq.getUsername())) {
      return false;
    }
    manager.createUser(
        User.builder()
            .passwordEncoder(this.encoder::encode)
            .password(registerReq.getPassword())
            .username(registerReq.getUsername())
            .roles(role.name())
            .build());
    return true;
  }
}
