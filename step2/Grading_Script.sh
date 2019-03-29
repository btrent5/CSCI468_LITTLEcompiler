#!/bin/sh

INPUTS=inputs/*
mkdir usertest
for i in $INPUTS
	do
		filename=${i%.*}
		name=${filename##*/}
		echo "Testing input file $i"
		output="${name}Test.out"
		outtest="${name}.out"
		./Micro $i > usertest/$output
		diff -B -b -s usertest/$output outputs/$outtest
	done
