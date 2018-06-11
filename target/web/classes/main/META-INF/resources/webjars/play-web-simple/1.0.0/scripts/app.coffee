riot.route.base '/'
riot.route.stop()
riot.route.start true

# sidenav = document.querySelector('side-nav')

riot.route('/', ->
  riot.mount '#content', 'dashboard'
)

riot.route('/dashboard', ->
  riot.mount '#content', 'dashboard'
)

riot.route('/auth/*', (sub) ->
  switch sub
    when 'sign-in'
      riot.mount '#content', 'sign-in'
    when 'sign-up'
      riot.mount '#content', 'sign-up'

  # riot.mount 'top-nav', { pages: ['authentication', sub] }
  # sidenav._tag.update { isActive: 'history' }
)
