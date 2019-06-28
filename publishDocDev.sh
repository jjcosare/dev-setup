#!/bin/sh

cd doc
gitbook install
rm -rf ../_book
gitbook build ./ ../_book
