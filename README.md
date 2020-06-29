# APPL1 : PRINSIP SOLID

Latihan prinsip SOLID dalam pemrograman oleh Nadia Melyani 181524023.

<b>1. Stream Progress</b>

Pada latihan ini, kode yang tersedia diminta di refactor agar Stream Progress Info dapat bekerja dengan berbagai jenis Stream. Refactor ini dimaksudkan agar suatu hari ketika terdapat Stream baru, yang harus dilakukan adalah hanya dengan menambahkan satu kelas.
Untuk memenuhi hal tersebut maka prinsip yang diterapkan adalah <b>Open/Closed Principle (OCP)</b>. Selain itu, prinsip lain yang diterapkan adalah <b>Liskov Substitute Principle (LSP)</b>.

<b>2. Graphic Editor</b>

Pada latihan Graphic Editor, kode diminta untuk di refactor sehingga Graphic Editor dapat menggabar semua jenis bentuk tanpa harus mengecek, bentuk mana yang akan digambar. Selain itu, suatu hari akan ada bentuk baru yang ditambahkan sehingga ketika penambahan bentuk baru dilakukan, hanya perlu menambahkan kelas saja.
<br>
Untuk memenuhi hal tersebut, maka prinsip yang diterapkan adalah <b>Open/Closed Principle (OCP)</b>. Selain itu, prinsip lain yang diterapkan adalah <b>Liskov Substitute Principle (LSP)</b>.

<b>3. Detail Printer</b>
Pada latihan Detail Printer, kode diminta untuk di refactor sehingga Detail Printer tidak perlu mengecek employee apa yang diberikan. Detail Printer hanya harus menampilakn detail dari semua jenis employee. Ketika suatu jenis employee baru ditambahkan, maka yang dilakukan hanyalah menambah kelas baru.
<br>
Untuk memenuhi hal tersebut, maka prinsip yang diterapkan adalah <b>Open/Closed Principle (OCP)</b>.

<b>4. Recharge</b>
Diberikan suatu library dengan kelas:
<ul>
  <li>Worker yang mengimplementasi ISleeper</li>
  <li>Employee yang inherit kepada Worker</li>
  <li>Robot yang inherit kepada Workerr</li>
  <li>RechargeStation</li>
 </ul>
 
 Terdapat beberapa kelas yang mempunyai method yang menggunakan throw UnsupportedOpperationException. Kode ini diminta untuk direfactor dibagian method yang menggunakan throw exception tersebut.
 <br>
 Untuk memenuhi hal tersebut, maka prinsip yang digunakan adalah <b>Open/Closed Principle (OCP)</b> dan <b>Interface Segregation Principle</b>.

<b>5. Security Door</b>
Diberikan suatu kelas:
<ul>
  <li>SecurityManager</li>
  <li>abstract kelas SecurityCheck</li>
  <li>interface SecurityUI</li>
 </ul>
 
 SecurityManager dapat berinteraksi dengan user dengan memvalidasi keycard atau dengan kode pin. Kedua method tersebut terdapat pada interface SecurityUI. Validasi dilakukan oleh kelas SecurityCheck.
 <br>
 Pada latihan ini, prinsip yang digunakan adalah <b>Open/Closed Principle (OCP)</b>, <b>Interface Segregation Principle</b>, dan <b>Dependency Inversion Principle</b>
