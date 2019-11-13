(defproject hello-graalvm "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]]
  :main ^:skip-aot hello-graalvm.core
  :plugins [[io.taylorwood/lein-native-image "0.3.1"]]
  :native-image {:name "hello-graalvm"
                 :opts ["--initialize-at-build-time"
                        "--report-unsupported-elements-at-runtime"]}
  :target-path "target/%s"
  :profiles {:uberjar
             {:aot          :all
              :native-image {:jvm-opts ["-Dclojure.compiler.direct-linking=true"]}}})
