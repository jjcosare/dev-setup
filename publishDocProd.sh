# publishDocs.sh from https://github.com/ochrons/scalajs-spa-tutorial
#!/bin/sh

cd doc
gitbook install
rm -rf ../_book
gitbook build ./ ../_book
cd ../_book
git init
git commit --allow-empty -m 'update book'
git checkout -b gh-pages
touch .nojekyll
git add .
git commit -am "update book"
git push git@github.com:jjcosare/dev-setup gh-pages --force
xdg-open https://jjcosare.github.io/dev-setup