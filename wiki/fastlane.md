# Fastlane

1. [Instructions](https://github.com/rbenv/rbenv#readme)
2. [Fastlane setup instructions](https://docs.fastlane.tools/getting-started/android/setup/)

> ⚠️ Do not use `sudo` while installing Ruby, bundler or anything else! ⚠️

```shell
#!/bin/sh

brew install rbenv ruby-build
rbenv init
curl -fsSL https://github.com/rbenv/rbenv-installer/raw/main/bin/rbenv-doctor | bash
ruby --version

rbenv install 3.1.2
rbenv local 3.1.2
rbenv global 3.1.2
rbenv rehash

rbenv version

gem install bundler
gem env home
```

Add to `~/.zshrc`:

```shell
# rbenv
eval "$(rbenv init - zsh)"
export GEM_HOME="$HOME/.gem"
```

Set `json_key_file` at [Appfile](../fastlane/Appfile)
