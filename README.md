World boundaries is a standalone library for geodecoding(only for countries).
NO DATABASE, NO REST API and NO QUOTA, just one jar and one dependency.
It's super fast and super easy to use.

### Usage

String country = CountryDecoder.decode(lat, long);

### Maven 

[https://clojars.org/world-boundaries]
<pre>
	&lt;dependency&gt;
	  &lt;groupId&gt;world-boundaries&lt;/groupId&gt;
	  &lt;artifactId&gt;world-boundaries&lt;/artifactId&gt;
	  &lt;version&gt;1.0.0&lt;/version&gt;
	&lt;/dependency&gt;
	
	&lt;repository&gt;
		&lt;id&gt;clojars.org&lt;/id&gt;
		&lt;url&gt;http://clojars.org/repo&lt;/url&gt;
	&lt;/repository&gt;
</pre>