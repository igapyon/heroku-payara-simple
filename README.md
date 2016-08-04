# Simple sample for Payara on Heroku

A barebones Java EE app based on Payara, which can easily be deployed to Heroku.

## Getting sample files from github

```sh
$ git clone https://github.com/igapyon/heroku-payara-simple
$ cd heroku-payara-simple/
```

## Deploying to Heroku

### Deploy

```sh
$ heroku login
$ heroku create
$ git push heroku master
```

### Check service alive

```sh
$ heroku open
```

### Remove unused old apps

```sh
$ heroku apps
$ heroku apps:destroy APPNAME --confirm APPNAME
```
