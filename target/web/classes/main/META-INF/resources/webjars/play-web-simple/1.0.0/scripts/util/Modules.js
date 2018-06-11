(function() {
  var __indexOf = [].indexOf || function(item) { for (var i = 0, l = this.length; i < l; i++) { if (i in this && this[i] === item) return i; } return -1; };

  mr.Module = (function() {
    var moduleKeywords;

    function Module() {}

    moduleKeywords = ['extended', 'included'];

    Module.include = function(obj) {
      var included, key, value, _ref;
      if (!obj) {
        throw 'include(obj) requires obj';
      }
      _ref = obj.prototype;
      for (key in _ref) {
        value = _ref[key];
        if (__indexOf.call(moduleKeywords, key) < 0) {
          this.prototype[key] = value;
        }
      }
      included = obj.included;
      if (included) {
        included.apply(this);
      }
      return this;
    };

    return Module;

  })();

}).call(this);

//# sourceMappingURL=Modules.js.map
