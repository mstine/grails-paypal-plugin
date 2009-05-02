class PaypalGrailsPlugin {
    // the plugin version
    def version = "0.3-SNAPSHOT"
    // the version or versions of Grails the plugin is designed for
    def grailsVersion = "1.1 > *"
    // the other plugins this plugin depends on
    def dependsOn = [:]
    // resources that are excluded from plugin packaging
    def pluginExcludes = [
			"grails-app/conf/Config.groovy",
			"grails-app/conf/DataSource/groovy",
			"grails-app/views/paypal/test.gsp",
            "grails-app/views/error.gsp",
			"grails-app/web-app/*"
    ]

    // TODO Fill in these fields
    def author = "Matt Stine (originally by Graeme Rocher)"
    def authorEmail = "matt@mattstine.com"
    def title = "A Grails plug-in that provides integration with Paypal's Instant Payment Notfication (IPN) system"
    def description = '''\
This plug-in allows Grails applications to integrate with Paypal and its Instant Payment Notification (IPN) system.

A PayPalController is provided that has a "notify" action which deals with responses from the PayPal IPN. In order for this to function
you need to enable IPN in your PayPal Profile under Profile / Instant Payment Notification Preferences and provide PayPal with the URL
you have mapped the "notify" action to.

In order for this plug-in to function you must configure the following settings in Config.groovy:

* grails.paypal.server - The URL of the paypal server 
* grails.paypal.email - The email of the merchant account
* grails.serverURL - The server URL for production 
'''

    // URL to the plugin's documentation
    def documentation = "http://grails.org/Paypal+Plugin"

    def doWithSpring = {
        // TODO Implement runtime spring config (optional)
    }

    def doWithApplicationContext = { applicationContext ->
        // TODO Implement post initialization spring config (optional)
    }

    def doWithWebDescriptor = { xml ->
        // TODO Implement additions to web.xml (optional)
    }

    def doWithDynamicMethods = { ctx ->
        // TODO Implement registering dynamic methods to classes (optional)
    }

    def onChange = { event ->
        // TODO Implement code that is executed when any artefact that this plugin is
        // watching is modified and reloaded. The event contains: event.source,
        // event.application, event.manager, event.ctx, and event.plugin.
    }

    def onConfigChange = { event ->
        // TODO Implement code that is executed when the project configuration changes.
        // The event is the same as for 'onChange'.
    }
}