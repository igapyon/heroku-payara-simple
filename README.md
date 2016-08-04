# Simple Java EE barebones running with Payara on Heroku

A barebones Java EE app based on Payara, with Payara Micro, which can easily be deployed to Heroku.

## Barebones for Payara and Heroku

This project provide simple barebones for Payara and Heroku.

Key codes are in lines below:

  https://github.com/igapyon/heroku-payara-simple/blob/v0.1/src/main/java/Main.java#L13

Additional point to be care is setting default context to root in war setting.

## Getting sample files from github

```sh
git clone https://github.com/igapyon/heroku-payara-simple
cd heroku-payara-simple/
```

## Deploying to Heroku

### Deploy

```sh
heroku login
heroku create
git push heroku master
```

### Check service alive

```sh
heroku open
```

### Remove unused old apps

```sh
heroku apps
heroku apps:destroy APPNAME --confirm APPNAME
```
