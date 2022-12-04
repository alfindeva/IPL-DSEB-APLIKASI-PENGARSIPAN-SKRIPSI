-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 04 Des 2022 pada 04.36
-- Versi server: 10.4.19-MariaDB
-- Versi PHP: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perpustakaan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_anggota`
--

CREATE TABLE `t_data_anggota` (
  `id_anggota` int(11) NOT NULL,
  `nama` varchar(30) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `no_hp` varchar(12) DEFAULT NULL,
  `domisili` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data_buku`
--

CREATE TABLE `t_data_buku` (
  `id_buku` int(11) NOT NULL,
  `judul` varchar(50) DEFAULT NULL,
  `pengarang` varchar(30) DEFAULT NULL,
  `penerbit` varchar(50) DEFAULT NULL,
  `kategori` varchar(30) DEFAULT NULL,
  `deskripsi` text DEFAULT NULL,
  `stok` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_peminjaman_buku`
--

CREATE TABLE `t_peminjaman_buku` (
  `id_peminjaman` int(11) NOT NULL,
  `id_anggota` int(11) DEFAULT NULL,
  `id_buku` int(11) DEFAULT NULL,
  `id_pustakawan` int(11) DEFAULT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `judul` varchar(50) DEFAULT NULL,
  `jumlah` int(11) DEFAULT NULL,
  `tgl_pinjam` varchar(30) DEFAULT NULL,
  `tgl_kembali` varchar(30) DEFAULT NULL,
  `denda` int(11) DEFAULT NULL,
  `status` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_pustakawan`
--

CREATE TABLE `t_pustakawan` (
  `id_pustakawan` int(11) NOT NULL,
  `nama_pustakawan` varchar(50) DEFAULT NULL,
  `nama_pengguna` varchar(50) DEFAULT NULL,
  `kata_sandi` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `t_data_anggota`
--
ALTER TABLE `t_data_anggota`
  ADD PRIMARY KEY (`id_anggota`);

--
-- Indeks untuk tabel `t_data_buku`
--
ALTER TABLE `t_data_buku`
  ADD PRIMARY KEY (`id_buku`);

--
-- Indeks untuk tabel `t_peminjaman_buku`
--
ALTER TABLE `t_peminjaman_buku`
  ADD PRIMARY KEY (`id_peminjaman`),
  ADD KEY `id_anggota` (`id_anggota`),
  ADD KEY `id_buku` (`id_buku`),
  ADD KEY `id_pustakawan` (`id_pustakawan`);

--
-- Indeks untuk tabel `t_pustakawan`
--
ALTER TABLE `t_pustakawan`
  ADD PRIMARY KEY (`id_pustakawan`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `t_data_anggota`
--
ALTER TABLE `t_data_anggota`
  MODIFY `id_anggota` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `t_data_buku`
--
ALTER TABLE `t_data_buku`
  MODIFY `id_buku` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT untuk tabel `t_peminjaman_buku`
--
ALTER TABLE `t_peminjaman_buku`
  MODIFY `id_peminjaman` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT untuk tabel `t_pustakawan`
--
ALTER TABLE `t_pustakawan`
  MODIFY `id_pustakawan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `t_peminjaman_buku`
--
ALTER TABLE `t_peminjaman_buku`
  ADD CONSTRAINT `t_peminjaman_buku_ibfk_1` FOREIGN KEY (`id_anggota`) REFERENCES `t_data_anggota` (`id_anggota`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `t_peminjaman_buku_ibfk_2` FOREIGN KEY (`id_buku`) REFERENCES `t_data_buku` (`id_buku`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `t_peminjaman_buku_ibfk_3` FOREIGN KEY (`id_pustakawan`) REFERENCES `t_pustakawan` (`id_pustakawan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
