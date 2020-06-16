INSERT IGNORE INTO `profile` (`id`, `name`) VALUES
  (1, 'Admin1'),
  (2, 'Admin2');

INSERT IGNORE INTO `users` (`id`, `login`, `password`, `profile_id`) VALUES
  (1, 'qwerty1', '1', 1),
  (1, 'qwerty2', '2', 2);