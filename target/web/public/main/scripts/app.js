(function() {
  riot.route.base('/');

  riot.route.stop();

  riot.route.start(true);

  riot.route('/', function() {
    return riot.mount('#content', 'dashboard');
  });

  riot.route('/dashboard', function() {
    return riot.mount('#content', 'dashboard');
  });

  riot.route('/auth/*', function(sub) {
    switch (sub) {
      case 'sign-in':
        return riot.mount('#content', 'sign-in');
      case 'sign-up':
        return riot.mount('#content', 'sign-up');
    }
  });

}).call(this);

//# sourceMappingURL=app.js.map
