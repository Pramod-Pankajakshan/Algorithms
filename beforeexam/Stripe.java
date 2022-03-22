package beforeexam;

import java.util.*;

/*
 * Click `Run` to execute the snippet below!
 */

import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Stripe {
	public static void main(String[] args) {

		Stripe s = new Stripe();
		s.validate1();
		s.validate2();
		s.validate3();

	}
    /**
     * TestCase 1 for  * parse_accept_language( "en-US, fr-CA, fr-FR", # the client's Accept-Language
     * header, a string ["fr-FR", "en-US"] # the server's supported languages, a set
     * of strings ) returns: ["en-US", "fr-FR"]
     */
	private void validate1() {
		Set<String> serverSet = new HashSet<>();
		serverSet.add("fr-FR");
		serverSet.add("en-US");
		List<String> res = this.parse_accept_language("en-US,fr-CA,fr-FR", serverSet);
		if (res.get(0).equals("en-US") && res.get(1).equals("fr-FR")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}
    /**
     * TestCase 2 for parse_accept_language("fr-CA, fr-FR", ["en-US", "fr-FR"]) returns: ["fr-FR"]
     */
	private void validate2() {
		Set<String> serverSet = new HashSet<>();
		serverSet.add("fr-FR");
		serverSet.add("en-US");
		List<String> res = this.parse_accept_language(" fr-CA, fr-FR", serverSet);
		if (res.get(0).equals("fr-FR")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}

	}
    /**
     * TestCase 3 for parse_accept_language("en-US", ["en-US", "fr-CA"]) returns: ["en-US"]
     */
	private void validate3() {
		Set<String> serverSet = new HashSet<>();
		serverSet.add("en-US");
		List<String> res = this.parse_accept_language("en-US,fr-CA", serverSet);
		if (res.get(0).equals("en-US")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

	/**
	 * 
	 * @param client
	 * @param serverSet
	 * @return
	 */
	private List<String> parse_accept_language(String client, Set<String> serverSet) {

		if (null == client || client.isEmpty() || null == serverSet || serverSet.isEmpty())
			return Collections.emptyList();

		String[] clientArr = client.split(",");
		System.out.println(clientArr.length);
		List<String> supportedList = new ArrayList<>();
		for (String clientStr : clientArr) {
			if (serverSet.contains(clientStr.trim())) {
				supportedList.add(clientStr.trim());
			}
		}

		return supportedList;
	}
}

/*
 * Your previous Plain Text content is preserved below:
 * 
 * Part 1
 * 
 * In an HTTP request, the Accept-Language header describes the list of
 * languages that the requester would like content to be returned in. The header
 * takes the form of a comma-separated list of language tags. For example:
 * 
 * Accept-Language: en-US, fr-CA, fr-FR
 * 
 * means that the reader would accept:
 * 
 * 1. English as spoken in the United States (most preferred) 2. French as
 * spoken in Canada 3. French as spoken in France (least preferred)
 * 
 * We're writing a server that needs to return content in an acceptable language
 * for the requester, and we want to make use of this header. Our server doesn't
 * support every possible language that might be requested (yet!), but there is
 * a set of languages that we do support. Write a function that receives two
 * arguments: an Accept-Language header value as a string and a set of supported
 * languages, and returns the list of language tags that that will work for the
 * request. The language tags should be returned in descending order of
 * preference (the same order as they appeared in the header).
 * 
 * In addition to writing this function, you should use tests to demonstrate
 * that it's correct, either via an existing testing system or one you create.
 * 
 * Examples:
 * 
 * parse_accept_language( "en-US, fr-CA, fr-FR", # the client's Accept-Language
 * header, a string ["fr-FR", "en-US"] # the server's supported languages, a set
 * of strings ) returns: ["en-US", "fr-FR"]
 * 
 * parse_accept_language("fr-CA, fr-FR", ["en-US", "fr-FR"]) returns: ["fr-FR"]
 * 
 * parse_accept_language("en-US", ["en-US", "fr-CA"]) returns: ["en-US"]
 * 
 * 
 * // input1 comes with pref order for client // input2 is whats supported by
 * server // return the best possible set based on whats supported by server -
 * look for input1 and search by - is supported if true add to result Server
 * list can be in a set - exclude the ones not in input2
 * 
 * 
 * 
 * 
 */